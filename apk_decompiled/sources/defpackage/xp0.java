package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactKind;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;

/* JADX INFO: loaded from: classes2.dex */
public final class xp0 extends iwe {
    public final ArtifactBottomSheetParams b;
    public final String c;
    public final yp0 d;
    public final Context e;
    public final h86 f;
    public final boolean g;
    public final zt0 h;
    public final boolean i;
    public final isc j;
    public final wz5 k;
    public final wz5 l;
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;
    public final lsc p;
    public final wz5 q;
    public final lsc r;
    public final wz5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(ArtifactBottomSheetParams artifactBottomSheetParams, String str, yp0 yp0Var, Context context, h86 h86Var, qi3 qi3Var, mn5 mn5Var) {
        super(h86Var);
        artifactBottomSheetParams.getClass();
        str.getClass();
        this.b = artifactBottomSheetParams;
        this.c = str;
        this.d = yp0Var;
        this.e = context;
        this.f = h86Var;
        boolean z = artifactBottomSheetParams instanceof ArtifactBottomSheetParams.WiggleFileArtifact;
        this.g = z;
        this.h = new zt0(qi3Var, mn5Var, z ? ArtifactViewerEvents$ArtifactKind.WIGGLE : ArtifactViewerEvents$ArtifactKind.IN_MESSAGE, new up0(this, 0));
        this.i = artifactBottomSheetParams.isShareEnabled();
        this.j = new isc(artifactBottomSheetParams.getVersionIndex());
        this.k = mpk.w(new up0(this, 1));
        a5 a5Var = a5.N;
        this.l = mpk.x(new up0(this, 2), a5Var);
        this.m = mpk.x(new up0(this, 3), a5Var);
        this.n = mpk.w(new up0(this, 4));
        this.o = mpk.w(new up0(this, 5));
        this.p = mpk.P(yt0.E);
        this.q = mpk.w(new up0(this, 6));
        this.r = mpk.P(Boolean.FALSE);
        this.s = mpk.w(new up0(this, 7));
    }

    public final tp0 O() {
        return (tp0) w44.O0(this.j.h(), ((t53) this.d).y0(this.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P() {
        /*
            r6 = this;
            boolean r0 = r6.i
            if (r0 == 0) goto L9b
            tp0 r0 = r6.O()
            if (r0 == 0) goto L9b
            com.anthropic.claude.artifact.model.ArtifactMetadata r1 = r0.b
            yp0 r6 = r6.d
            t53 r6 = (defpackage.t53) r6
            r6.getClass()
            saj r2 = r6.S
            mdg r2 = r2.e
            zcg r2 = r2.H
            r3 = 1
            if (r2 == 0) goto L25
            mdg r4 = r2.E
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L25
            goto L4c
        L25:
            java.util.Iterator r2 = r2.iterator()
        L29:
            r4 = r2
            hmg r4 = (defpackage.hmg) r4
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L4c
            r4 = r2
            hmg r4 = (defpackage.hmg) r4
            java.lang.Object r4 = r4.next()
            tp0 r4 = (defpackage.tp0) r4
            com.anthropic.claude.artifact.model.ArtifactMetadata r4 = r4.b
            com.anthropic.claude.artifact.model.ArtifactUuid r4 = r4.getUuid()
            com.anthropic.claude.artifact.model.ArtifactUuid r5 = r1.getUuid()
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 == 0) goto L29
            goto L9a
        L4c:
            o33 r2 = r6.z0()
            java.util.Map r2 = r2.b()
            com.anthropic.claude.artifact.model.ArtifactMetadata r0 = r0.a()
            com.anthropic.claude.artifact.model.ArtifactUuid r0 = r0.getUuid()
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            com.anthropic.claude.types.strings.MessageId r0 = (com.anthropic.claude.types.strings.MessageId) r0
            r2 = 0
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.m1057unboximpl()
            goto L6d
        L6c:
            r0 = r2
        L6d:
            if (r0 == 0) goto L9b
            o33 r6 = r6.z0()
            java.util.LinkedHashMap r6 = r6.a
            com.anthropic.claude.types.strings.MessageId r0 = com.anthropic.claude.types.strings.MessageId.m1051boximpl(r0)
            java.lang.Object r6 = r6.get(r0)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L90
            java.lang.String r0 = r1.m537getIdentifiereX_QYXY()
            com.anthropic.claude.types.strings.ArtifactIdentifier r0 = com.anthropic.claude.types.strings.ArtifactIdentifier.m964boximpl(r0)
            java.lang.Object r6 = r6.get(r0)
            r2 = r6
            com.anthropic.claude.artifact.model.ArtifactUuid r2 = (com.anthropic.claude.artifact.model.ArtifactUuid) r2
        L90:
            com.anthropic.claude.artifact.model.ArtifactUuid r6 = r1.getUuid()
            boolean r6 = defpackage.x44.r(r2, r6)
            if (r6 != r3) goto L9b
        L9a:
            return r3
        L9b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp0.P():boolean");
    }

    public final int Q() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final boolean R() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        zt0 zt0Var = this.h;
        zt0Var.getClass();
        zt0Var.a(ArtifactViewerEvents$ArtifactViewResult.ABANDONED);
        super.onDestroy();
    }
}
