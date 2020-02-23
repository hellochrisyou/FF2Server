package LiveAuction;

import dto.AuctionDto;

public class LiveAuction {
	private static final int BIDDELAY = 6000;
    Thread mainThread = new Thread(); 
    AuctionDto curAuctionDto;
    
    public LiveAuction() {};
    
	public AuctionDto startGoingBid(AuctionDto auctionDto) throws InterruptedException {
    	this.curAuctionDto = new AuctionDto(auctionDto.getCurrentBidder(), auctionDto.getAskingBid(), auctionDto.getPlayerName());

		synchronized (this.mainThread) {
			mainThread.wait(BIDDELAY);
		}
	     return this.curAuctionDto;
	}
	public void makeBid(AuctionDto auctionDto) throws InterruptedException {
		this.mainThread.interrupt();
		this.startGoingBid(auctionDto);
		return;
	}
}
