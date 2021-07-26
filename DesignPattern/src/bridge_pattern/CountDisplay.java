package bridge_pattern;

/*
 * 機能クラス階層
 * 「指定回数だけ表示する」機能を追加したクラス
 *
 */
public class CountDisplay extends BridgeDisplay{

	public CountDisplay(BridgeDisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times){
		open();

		for(int i = 0; i <times; i++){
			print();
		}

		close();
	}

}
