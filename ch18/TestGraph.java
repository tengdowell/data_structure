package ch18;

/**
 * @author:孙博腾
 * @E-mail:tengdowell@gmail.com
 * @version 创建时间：2018年1月31日 上午10:14:05
 * @类说明:
 */
public class TestGraph {
	public static void main(String[] args) {
		Graph g = new Graph();
		// 插入顶点
		g.insertV('A');
		g.insertV('B');
		g.insertV('C');
		// 插入边
		g.insertB(0, 1);
		g.insertB(0, 2);
		g.insertB(1, 1);
	}
}
