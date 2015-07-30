package demo.domain;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FortunePowerBall {
	int ball1;
	int ball2;
	int ball3;
	int ball4;
	int ball5;
	int powerBall;
	private static final int BALL_SEED=59;
	private static final int POWERBALL_SEED=35;
	
	public FortunePowerBall() {
		Random random = new Random();
		IntStream intStream = random.ints(1, BALL_SEED);
		List<Integer> randomBetween0And59 = intStream
				.limit(5)
				.boxed()
				.collect(Collectors.toList());
		ball1 = randomBetween0And59.get(0).intValue();
		ball2 = randomBetween0And59.get(1).intValue();
		ball3 = randomBetween0And59.get(2).intValue();
		ball4 = randomBetween0And59.get(3).intValue();
		ball5 = randomBetween0And59.get(4).intValue();
		
		intStream = random.ints(1, POWERBALL_SEED);
		List<Integer> randomBetween0And35 = intStream
				.limit(1)
				.boxed()
				.collect(Collectors.toList());
		powerBall = randomBetween0And35.get(0).intValue();
	}
	public FortunePowerBall(int ball1, int ball2, int ball3, int ball4, int ball5, int powerBall) {
		this.ball1 = ball1;
		this.ball2 = ball2;
		this.ball3 = ball3;
		this.ball4 = ball4;
		this.ball5 = ball5;
		this.powerBall = powerBall;
	}
	public int getBall1() {
		return ball1;
	}
	public void setBall1(int ball1) {
		this.ball1 = ball1;
	}
	public int getBall2() {
		return ball2;
	}
	public void setBall2(int ball2) {
		this.ball2 = ball2;
	}
	public int getBall3() {
		return ball3;
	}
	public void setBall3(int ball3) {
		this.ball3 = ball3;
	}
	public int getBall4() {
		return ball4;
	}
	public void setBall4(int ball4) {
		this.ball4 = ball4;
	}
	public int getBall5() {
		return ball5;
	}
	public void setBall5(int ball5) {
		this.ball5 = ball5;
	}
	public int getPowerBall() {
		return powerBall;
	}
	public void setPowerBall(int powerBall) {
		this.powerBall = powerBall;
	}
}
