package bridge_pattern;

/*
 * 実装クラス階層
 * 「表示する」クラス
 *
 */
public abstract class BridgeDisplayImpl {

	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();

}
