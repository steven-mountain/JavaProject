class SelectRandom{
	public static int getRandom(int... numbers){
		int ran = 1 + (int)(Math.random() * 54);
		for(int i = 0; i < numbers.length; ++i){
			if(ran == numbers[i])
				ran = 1 + (int)(Math.random() * 54);
		}
		return ran;
	}
}