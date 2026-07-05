package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.PublishedArtifactId;

/* JADX INFO: loaded from: classes2.dex */
public final class pwd extends iwe {
    public final Context b;
    public final PublishArtifactParams c;
    public final koi d;
    public final nu0 e;
    public final js0 f;
    public final qi3 g;
    public final saj h;
    public final haj i;
    public final u3g j;
    public final zy1 k;
    public final wz5 l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final wz5 q;

    public pwd(Context context, PublishArtifactParams publishArtifactParams, koi koiVar, nu0 nu0Var, js0 js0Var, qi3 qi3Var, saj sajVar, haj hajVar, h86 h86Var) {
        super(h86Var);
        this.b = context;
        this.c = publishArtifactParams;
        this.d = koiVar;
        this.e = nu0Var;
        this.f = js0Var;
        this.g = qi3Var;
        this.h = sajVar;
        this.i = hajVar;
        this.j = koiVar.i() ? u3g.E : u3g.F;
        this.k = x44.a();
        final int i = 0;
        this.l = mpk.w(new zy7(this) { // from class: ewd
            public final /* synthetic */ pwd F;

            {
                this.F = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ewd.a():java.lang.Object");
            }
        });
        this.m = mpk.P(null);
        this.n = mpk.P(null);
        this.o = mpk.P(Boolean.FALSE);
        this.p = mpk.P(ArtifactId.m957boximpl(publishArtifactParams.getArtifactMetadata().m538getVersionUuidQssJVS4()));
        final int i2 = 1;
        this.q = mpk.w(new zy7(this) { // from class: ewd
            public final /* synthetic */ pwd F;

            {
                this.F = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ewd.a():java.lang.Object");
            }
        });
        gb9.D(this.a, null, null, new fwd(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.pwd r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.O(pwd, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.pwd r24, defpackage.vp4 r25) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.P(pwd, vp4):java.lang.Object");
    }

    public static final void Q(pwd pwdVar, String str) {
        pwdVar.n.setValue(str != null ? PublishedArtifactId.m1086boximpl(str) : null);
    }

    public static final ArtifactSharingEvents$ArtifactShareVisibility R(pwd pwdVar, ArtifactVisibility artifactVisibility) {
        pwdVar.getClass();
        int i = artifactVisibility == null ? -1 : gwd.a[artifactVisibility.ordinal()];
        if (i == -1 || i == 1) {
            return ArtifactSharingEvents$ArtifactShareVisibility.UNSPECIFIED;
        }
        if (i == 2) {
            return pwdVar.d.i() ? ArtifactSharingEvents$ArtifactShareVisibility.ORGANIZATION : ArtifactSharingEvents$ArtifactShareVisibility.PUBLIC;
        }
        if (i == 3) {
            return ArtifactSharingEvents$ArtifactShareVisibility.PRIVATE;
        }
        wg6.i();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(defpackage.pwd r14, java.lang.String r15, defpackage.vp4 r16) {
        /*
            r0 = r16
            r14.getClass()
            mp4 r7 = r14.a
            boolean r2 = r0 instanceof defpackage.mwd
            if (r2 == 0) goto L1b
            r2 = r0
            mwd r2 = (defpackage.mwd) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.I = r3
        L19:
            r6 = r2
            goto L21
        L1b:
            mwd r2 = new mwd
            r2.<init>(r14, r0)
            goto L19
        L21:
            java.lang.Object r0 = r6.G
            int r2 = r6.I
            r8 = 3
            r9 = 2
            r3 = 1
            r10 = 0
            m45 r11 = defpackage.m45.E
            if (r2 == 0) goto L49
            if (r2 == r3) goto L42
            if (r2 != r9) goto L3c
            long r2 = r6.F
            nf0 r4 = r6.E
            defpackage.sf5.h0(r0)
            r1 = r4
            r4 = r2
            goto La7
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r10
        L42:
            long r2 = r6.F
            defpackage.sf5.h0(r0)
            r3 = r2
            goto L62
        L49:
            defpackage.sf5.h0(r0)
            long r4 = java.lang.System.currentTimeMillis()
            nu0 r0 = r14.e
            koi r2 = r14.d
            java.lang.String r2 = r2.e
            r6.F = r4
            r6.I = r3
            java.lang.Object r0 = r0.c(r2, r15, r6)
            if (r0 != r11) goto L61
            goto La4
        L61:
            r3 = r4
        L62:
            r12 = r0
            com.anthropic.claude.api.result.ApiResult r12 = (com.anthropic.claude.api.result.ApiResult) r12
            boolean r13 = r12 instanceof defpackage.of0
            if (r13 == 0) goto L83
            r0 = r12
            of0 r0 = (defpackage.of0) r0
            java.lang.Object r0 = r0.b
            iei r0 = (defpackage.iei) r0
            Q(r14, r10)
            com.anthropic.claude.api.artifacts.ArtifactVisibility r2 = com.anthropic.claude.api.artifacts.ArtifactVisibility.PRIVATE
            r14.V(r2)
            jwd r0 = new jwd
            r5 = 0
            r1 = r14
            r0.<init>(r1, r2, r3, r5)
            defpackage.gb9.D(r7, r10, r10, r0, r8)
            goto L87
        L83:
            boolean r0 = r12 instanceof defpackage.nf0
            if (r0 == 0) goto Lbb
        L87:
            if (r13 != 0) goto Lb8
            boolean r0 = r12 instanceof defpackage.nf0
            if (r0 == 0) goto Lb4
            r0 = r12
            nf0 r0 = (defpackage.nf0) r0
            zy1 r2 = r14.k
            tt6 r5 = new tt6
            r12 = 0
            r5.<init>(r12)
            r6.E = r0
            r6.F = r3
            r6.I = r9
            java.lang.Object r2 = r2.b(r6, r5)
            if (r2 != r11) goto La5
        La4:
            return r11
        La5:
            r1 = r0
            r4 = r3
        La7:
            com.anthropic.claude.api.artifacts.ArtifactVisibility r3 = com.anthropic.claude.api.artifacts.ArtifactVisibility.PRIVATE
            kwd r0 = new kwd
            r6 = 0
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r6)
            defpackage.gb9.D(r7, r10, r10, r0, r8)
            goto Lb8
        Lb4:
            defpackage.wg6.i()
            return r10
        Lb8:
            iei r0 = defpackage.iei.a
            return r0
        Lbb:
            defpackage.wg6.i()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.S(pwd, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r8.k.b(r0, r9) == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(com.anthropic.claude.artifact.model.WiggleArtifactIdentifier r9, defpackage.vp4 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.hwd
            if (r0 == 0) goto L13
            r0 = r10
            hwd r0 = (defpackage.hwd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            hwd r0 = new hwd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L36
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            defpackage.sf5.h0(r10)
            goto Lae
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L32:
            defpackage.sf5.h0(r10)
            goto L68
        L36:
            defpackage.sf5.h0(r10)
            koi r10 = r8.d
            java.lang.String r10 = r10.e
            java.lang.String r1 = r9.m542getChatIdRjYBDck()
            com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactRequest r6 = new com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactRequest
            java.lang.String r9 = r9.getEncodedPath()
            u3g r7 = r8.j
            int r7 = r7.ordinal()
            if (r7 == 0) goto L58
            if (r7 != r4) goto L54
            jaj r7 = defpackage.jaj.F
            goto L5a
        L54:
            defpackage.wg6.i()
            return r2
        L58:
            jaj r7 = defpackage.jaj.E
        L5a:
            r6.<init>(r9, r7)
            r0.G = r4
            haj r9 = r8.i
            java.lang.Object r10 = r9.b(r10, r1, r6, r0)
            if (r10 != r5) goto L68
            goto La9
        L68:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r9 = r10 instanceof defpackage.of0
            if (r9 == 0) goto L8f
            r1 = r10
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse r1 = (com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse) r1
            java.lang.String r4 = r1.m455getArtifact_version_uuidQssJVS4()
            lsc r6 = r8.p
            com.anthropic.claude.types.strings.ArtifactId r4 = com.anthropic.claude.types.strings.ArtifactId.m957boximpl(r4)
            r6.setValue(r4)
            java.lang.String r1 = r1.m456getPublished_artifact_uuidvF4hnP0()
            Q(r8, r1)
            com.anthropic.claude.api.artifacts.ArtifactVisibility r1 = com.anthropic.claude.api.artifacts.ArtifactVisibility.SHARED
            r8.V(r1)
            goto L93
        L8f:
            boolean r1 = r10 instanceof defpackage.nf0
            if (r1 == 0) goto Lb1
        L93:
            if (r9 != 0) goto Lae
            boolean r9 = r10 instanceof defpackage.nf0
            if (r9 == 0) goto Laa
            tt6 r9 = new tt6
            r10 = 0
            r9.<init>(r10)
            r0.G = r3
            zy1 r8 = r8.k
            java.lang.Object r8 = r8.b(r0, r9)
            if (r8 != r5) goto Lae
        La9:
            return r5
        Laa:
            defpackage.wg6.i()
            return r2
        Lae:
            iei r8 = defpackage.iei.a
            return r8
        Lb1:
            defpackage.wg6.i()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.T(com.anthropic.claude.artifact.model.WiggleArtifactIdentifier, vp4):java.lang.Object");
    }

    public final String U() {
        return ((ArtifactId) this.p.getValue()).m963unboximpl();
    }

    public final void V(ArtifactVisibility artifactVisibility) {
        this.m.setValue(artifactVisibility);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(defpackage.vp4 r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwd.W(vp4, java.lang.String, boolean):java.lang.Object");
    }
}
