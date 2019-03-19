package front;

import java.util.Random;

public class poker {
	int[] id;// 用来判定这张牌是否发过
	Random random;

	poker() {
		id = new int[52];
		random = new Random();
	}

	int[] deal(int num) {
		int[] card = new int[num];
		for (int i = 0; i < num; i++) {
			for (;;) {
				int onecard = Math.round(random.nextInt(52));
				if (id[onecard] == 1)
					continue;
				else {
					card[i] = onecard;
					id[onecard] = 1;
					break;
				}
			}
		}
		return card;
	}

	void reset() {
		for (int i = 0; i < id.length; i++)
			id[i] = 0;
	}
}
