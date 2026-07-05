package androidx.compose.material3;

import defpackage.d54;
import defpackage.due;
import defpackage.gwa;
import defpackage.jwa;
import defpackage.k54;
import defpackage.on4;
import defpackage.yb5;
import defpackage.yte;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingThemeAwareRippleNode b;

    public /* synthetic */ c(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.a = i;
        this.b = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.k54
    public final long a() {
        int i = this.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.b;
        switch (i) {
            case 0:
                long jA = delegatingThemeAwareRippleNode.color.a();
                if (jA != 16) {
                    return jA;
                }
                yte yteVar = (yte) yb5.o(delegatingThemeAwareRippleNode, due.b);
                if (yteVar != null) {
                    long j = yteVar.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((d54) yb5.o(delegatingThemeAwareRippleNode, on4.a)).a;
            case 1:
                return ((gwa) yb5.o(delegatingThemeAwareRippleNode, jwa.a)).a.g;
            default:
                return ((gwa) yb5.o(delegatingThemeAwareRippleNode, jwa.a)).a.f;
        }
    }
}
