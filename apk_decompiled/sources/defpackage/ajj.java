package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public final class ajj extends gre implements pz7 {
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ zj6 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajj(zj6 zj6Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = zj6Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ajj ajjVar = new ajj(this.J, tp4Var);
        ajjVar.I = obj;
        return ajjVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ajj) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int length;
        int i;
        Object ro6Var;
        Node node = (Node) this.J.F;
        zmf zmfVar = (zmf) this.I;
        int i2 = this.H;
        if (i2 == 0) {
            sf5.h0(obj);
            length = node.getChildNodes().getLength();
            i = 0;
        } else {
            if (i2 != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.G;
            int i3 = this.F;
            sf5.h0(obj);
            i = i3 + 1;
        }
        if (i >= length) {
            return iei.a;
        }
        node.getChildNodes().getLength();
        Node nodeItem = node.getChildNodes().item(i);
        if (nodeItem instanceof Element) {
            ro6Var = new zj6((Element) nodeItem);
        } else {
            nodeItem.getClass();
            ro6Var = new ro6(16, nodeItem);
        }
        this.I = zmfVar;
        this.F = i;
        this.G = length;
        this.H = 1;
        zmfVar.d(this, ro6Var);
        return m45.E;
    }
}
