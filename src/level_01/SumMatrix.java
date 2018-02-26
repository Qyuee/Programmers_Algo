package level_01;
class SumMatrix {
	
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];

		// [A(0,0)+B(0,0), A(0,1)+B(0,1)], [A(1,0)+B(1,0), A(1,1)+B(1,1)]
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				answer[i][j]=0;
				answer[i][j]=A[i][j]+B[i][j];
			}
		}
		
		check(answer);
		
		return answer;
	}
	
	public void check(int [][] answer) {
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				System.out.print(answer[i][j]+" ");
			}
		}
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 }, {10,20}};
		int[][] B = { { 3, 4 }, { 5, 6 }, {20,30}};
		
		int[][] answer = c.sumMatrix(A, B);
		
		if (answer[0][0] == 4 && answer[0][1] == 6 && answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
	}
}