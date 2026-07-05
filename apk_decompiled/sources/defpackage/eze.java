package defpackage;

import android.view.View;
import android.view.Window;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class eze extends sm7 {
    public final Window.Callback F;
    public final tk5 G;

    public eze(Window.Callback callback) {
        super(callback);
        this.F = callback;
        this.G = new tk5(9);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sm7, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        tk5 tk5Var = this.G;
        tk5Var.getClass();
        for (Object obj : (CopyOnWriteArraySet) tk5Var.F) {
            obj.getClass();
            bye byeVar = (bye) obj;
            byeVar.I.R(byeVar.F, byeVar);
            View decorView = byeVar.F.getWindow().getDecorView();
            decorView.getClass();
            if (!byeVar.K) {
                if (decorView.isAttachedToWindow()) {
                    byeVar.a(decorView);
                } else {
                    decorView.addOnAttachStateChangeListener(byeVar);
                }
            }
        }
    }
}
