package defpackage;

import androidx.compose.foundation.layout.b;
import coil3.compose.AsyncImagePainter;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kv2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ kv2(iqb iqbVar, boolean z, boolean z2, bz7 bz7Var, bpc bpcVar, String str) {
        this.H = iqbVar;
        this.F = z;
        this.G = z2;
        this.I = bz7Var;
        this.J = bpcVar;
        this.K = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.J;
        Object obj5 = this.K;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj3;
                bpc bpcVar = (bpc) obj4;
                String str = (String) obj5;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarV = xn5.V(this.H, xve.a);
                    boolean z = this.F;
                    if (z) {
                        e18Var.a0(-894442125);
                        j = gm3.a(e18Var).m;
                    } else {
                        e18Var.a0(-894440762);
                        j = gm3.a(e18Var).n;
                    }
                    e18Var.p(false);
                    iqb iqbVarJ = gb9.J(kzj.h(yfd.p(iqbVarV, j, zni.b), z, this.G, new vue(2), bz7Var, 8), 4.0f);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    cv8.b(bpcVar, str, b.o(fqb.E, 24.0f), 0L, e18Var, 392, 8);
                    wd6.K(fxe.a, z, null, null, null, null, twj.a, e18Var, 1572870, 30);
                    e18Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                fuk.h((ImageGalleryItem) obj3, (AsyncImagePainter) obj4, this.F, this.G, this.H, (zy7) obj5, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qbb.a((List) obj4, this.F, this.G, (bz7) obj3, (zy7) obj5, this.H, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bjk.b((m0h) obj4, this.H, this.F, this.G, (bz7) obj3, (ta4) obj5, (ld4) obj, x44.p0(12611001));
                break;
            default:
                ((Integer) obj2).getClass();
                ikk.j((String) obj5, (String) obj4, this.F, (bz7) obj3, this.H, this.G, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ kv2(m0h m0hVar, iqb iqbVar, boolean z, boolean z2, bz7 bz7Var, ta4 ta4Var, int i) {
        this.J = m0hVar;
        this.H = iqbVar;
        this.F = z;
        this.G = z2;
        this.I = bz7Var;
        this.K = ta4Var;
    }

    public /* synthetic */ kv2(ImageGalleryItem imageGalleryItem, AsyncImagePainter asyncImagePainter, boolean z, boolean z2, iqb iqbVar, zy7 zy7Var, int i) {
        this.I = imageGalleryItem;
        this.J = asyncImagePainter;
        this.F = z;
        this.G = z2;
        this.H = iqbVar;
        this.K = zy7Var;
    }

    public /* synthetic */ kv2(String str, String str2, boolean z, bz7 bz7Var, iqb iqbVar, boolean z2, int i) {
        this.K = str;
        this.J = str2;
        this.F = z;
        this.I = bz7Var;
        this.H = iqbVar;
        this.G = z2;
    }

    public /* synthetic */ kv2(List list, boolean z, boolean z2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.J = list;
        this.F = z;
        this.G = z2;
        this.I = bz7Var;
        this.K = zy7Var;
        this.H = iqbVar;
    }
}
