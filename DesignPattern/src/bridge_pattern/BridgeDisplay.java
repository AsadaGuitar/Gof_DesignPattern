package bridge_pattern;

/*
 * 機能クラス階層
 * 「表示する」クラス
 *
 */
public class BridgeDisplay {

	private BridgeDisplayImpl impl;

	public BridgeDisplay(BridgeDisplayImpl impl){
		this.impl = impl;
	}

	public void open(){
		impl.rawOpen();
	}

	public void print(){
		impl.rawPrint();
	}

	public void close(){
		impl.rawClose();
	}

	public final void display(){
		open();
		print();
		close();
	}
}
