package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class fb extends tw7 {
    public final /* synthetic */ int N = 0;
    public final /* synthetic */ View O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.O = actionMenuItemView;
    }

    @Override // defpackage.tw7
    public final l5g b() {
        hb hbVar;
        int i = this.N;
        View view = this.O;
        switch (i) {
            case 0:
                gb gbVar = ((ActionMenuItemView) view).Q;
                if (gbVar == null || (hbVar = ((ib) gbVar).a.X) == null) {
                    return null;
                }
                return hbVar.a();
            default:
                hb hbVar2 = ((jb) view).H.W;
                if (hbVar2 == null) {
                    return null;
                }
                return hbVar2.a();
        }
    }

    @Override // defpackage.tw7
    public final boolean c() {
        l5g l5gVarB;
        int i = this.N;
        View view = this.O;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                ucb ucbVar = actionMenuItemView.O;
                if (ucbVar == null || !ucbVar.a(actionMenuItemView.L) || (l5gVarB = b()) == null || !l5gVarB.b()) {
                }
                break;
            default:
                ((jb) view).H.l();
                break;
        }
        return true;
    }

    @Override // defpackage.tw7
    public boolean d() {
        switch (this.N) {
            case 1:
                kb kbVar = ((jb) this.O).H;
                if (kbVar.Y != null) {
                    return false;
                }
                kbVar.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(jb jbVar, jb jbVar2) {
        super(jbVar2);
        this.O = jbVar;
    }
}
