package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca4 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ba4 ba4Var, ta4 ta4Var) {
        View childAt = ((ViewGroup) ba4Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ed4 ed4Var = childAt instanceof ed4 ? (ed4) childAt : null;
        if (ed4Var != null) {
            ed4Var.setParentCompositionContext(null);
            ed4Var.setContent(ta4Var);
            return;
        }
        ed4 ed4Var2 = new ed4(ba4Var);
        ed4Var2.setParentCompositionContext(null);
        ed4Var2.setContent(ta4Var);
        View decorView = ba4Var.getWindow().getDecorView();
        if (ink.a(decorView) == null) {
            decorView.setTag(com.anthropic.claude.R.id.view_tree_lifecycle_owner, ba4Var);
        }
        if (syi.a(decorView) == null) {
            decorView.setTag(com.anthropic.claude.R.id.view_tree_view_model_store_owner, ba4Var);
        }
        if (ryi.a(decorView) == null) {
            decorView.setTag(com.anthropic.claude.R.id.view_tree_saved_state_registry_owner, ba4Var);
        }
        ba4Var.setContentView(ed4Var2, a);
    }
}
