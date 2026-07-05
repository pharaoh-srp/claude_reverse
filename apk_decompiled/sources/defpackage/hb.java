package defpackage;

import android.content.Context;
import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hb extends odb {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ kb m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(kb kbVar, Context context, xug xugVar, View view) {
        super(context, xugVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = kbVar;
        if ((xugVar.A.x & 32) != 32) {
            View view2 = kbVar.M;
            this.e = view2 == null ? (View) kbVar.L : view2;
        }
        ive iveVar = kbVar.a0;
        this.h = iveVar;
        mdb mdbVar = this.i;
        if (mdbVar != null) {
            mdbVar.f(iveVar);
        }
    }

    @Override // defpackage.odb
    public final void c() {
        int i = this.l;
        kb kbVar = this.m;
        switch (i) {
            case 0:
                kbVar.X = null;
                super.c();
                break;
            default:
                vcb vcbVar = kbVar.G;
                if (vcbVar != null) {
                    vcbVar.c(true);
                }
                kbVar.W = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(kb kbVar, Context context, vcb vcbVar, View view) {
        super(context, vcbVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = kbVar;
        this.f = 8388613;
        ive iveVar = kbVar.a0;
        this.h = iveVar;
        mdb mdbVar = this.i;
        if (mdbVar != null) {
            mdbVar.f(iveVar);
        }
    }
}
