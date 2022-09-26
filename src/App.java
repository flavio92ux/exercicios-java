// 1. Determine	 as	 raízes	 de	 uma equação	 de	 2º	 grau:	 ax2+bx+c=0	(recordar que o	
// discriminante	Δ =	b2 – 4ac,	e	que	a	raiz	r	=	(–b	± √Δ)/2a).

public class App {
    public static void main(String[] args) throws Exception {
        Delta delta = new Delta(1, 4, 4);

        delta.getRoots();
    }
}
