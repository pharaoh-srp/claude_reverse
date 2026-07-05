package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class x10 implements View.OnDragListener, lb6 {
    public final mb6 a = new mb6(null, 3);
    public final ip0 b = new ip0(0);
    public final w10 c = new w10(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        gb6 gb6Var = new gb6(dragEvent);
        int action = dragEvent.getAction();
        ip0 ip0Var = this.b;
        mb6 mb6Var = this.a;
        switch (action) {
            case 1:
                z9e z9eVar = new z9e();
                j70 j70Var = new j70(gb6Var, mb6Var, z9eVar, 1);
                if (j70Var.invoke(mb6Var) == o6i.E) {
                    j8.p0(mb6Var, j70Var);
                }
                boolean z = z9eVar.E;
                ip0Var.getClass();
                hp0 hp0Var = new hp0(ip0Var);
                while (hp0Var.hasNext()) {
                    ((nb6) hp0Var.next()).G0(gb6Var);
                }
                break;
            case 2:
                mb6Var.H0(gb6Var);
                break;
            case 4:
                mb6Var.J(gb6Var);
                ip0Var.clear();
                break;
            case 5:
                mb6Var.u(gb6Var);
                break;
            case 6:
                mb6Var.s0(gb6Var);
                break;
        }
        return false;
    }
}
