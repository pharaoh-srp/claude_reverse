package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fu implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ mnc H;
    public final /* synthetic */ float I;

    public fu(List list, bz7 bz7Var, zy7 zy7Var, mnc mncVar, float f) {
        this.E = list;
        this.F = bz7Var;
        this.G = zy7Var;
        this.H = mncVar;
        this.I = f;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            ArtifactMetadata artifactMetadata = (ArtifactMetadata) this.E.get(iIntValue);
            e18Var.a0(662259636);
            bz7 bz7Var = this.F;
            boolean zF = e18Var.f(bz7Var) | e18Var.f(artifactMetadata);
            zy7 zy7Var = this.G;
            boolean zF2 = zF | e18Var.f(zy7Var);
            Object objN = e18Var.N();
            if (zF2 || objN == jd4.a) {
                objN = new n4(bz7Var, artifactMetadata, zy7Var, 1);
                e18Var.k0(objN);
            }
            fqb fqbVar = fqb.E;
            xuj.e(artifactMetadata, (zy7) objN, gb9.I(b.c(fqbVar, 1.0f), this.H), false, e18Var, 0, 8);
            grc.z(fqbVar, this.I, e18Var, false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
