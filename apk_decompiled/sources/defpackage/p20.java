package defpackage;

import android.content.Context;
import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final class p20 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ p20(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.E) {
            case 0:
                q20 q20Var = (q20) this.F;
                Context context = view.getContext();
                if (!q20Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(q20Var.f);
                    q20Var.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                q20 q20Var = (q20) obj;
                Context context = view.getContext();
                if (q20Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(q20Var.f);
                    q20Var.d = false;
                }
                q20.d(q20Var);
                break;
            case 1:
                a1 a1Var = (a1) obj;
                for (Object obj2 : kik.g(a1Var)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                a1Var.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((fkg) obj).d(null);
                break;
        }
    }
}
