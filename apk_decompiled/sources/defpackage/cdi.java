package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class cdi extends a0 {
    @Override // defpackage.hn0
    public final void a(int i, Object obj) {
        ((av9) this.G).O(i, (av9) obj);
    }

    @Override // defpackage.hn0
    public final void c() {
        ((av9) this.G).i();
    }

    @Override // defpackage.hn0
    public final void d(int i, int i2, int i3) {
        ((av9) this.G).i0(i, i2, i3);
    }

    @Override // defpackage.hn0
    public final void e(int i, int i2) {
        ((av9) this.G).q0(i, i2);
    }

    @Override // defpackage.hn0
    public final /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    @Override // defpackage.hn0
    public final void i() {
        Owner owner = ((av9) this.F).S;
        if (owner != null) {
            ((AndroidComposeView) owner).x();
        }
    }

    @Override // defpackage.a0
    public final void n() {
        ((av9) this.F).p0();
    }
}
