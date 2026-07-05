package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.AskUserInputV0Input;
import com.anthropic.claude.tool.model.CreateFileInput;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0Input;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0Output;
import com.anthropic.claude.tool.model.PresentFilesInput;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.tool.model.RequestUserBrowserTakeoverInput;
import com.anthropic.claude.tool.model.RequestUserBrowserTakeoverOutput;
import com.anthropic.claude.tool.ui.chat.f;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends dxh {
    public final /* synthetic */ int e;
    public final String f;
    public final String g;
    public final dwh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(mwh mwhVar, String str, int i) {
        super(mwhVar, AskUserInputV0Input.Companion.serializer(), kei.b);
        this.e = i;
        switch (i) {
            case 2:
                super(mwhVar, PlacesMapDisplayV0Input.Companion.serializer(), PlacesMapDisplayV0Output.Companion.serializer());
                this.f = str;
                this.g = hxh.l;
                this.h = new dwh();
                break;
            case 3:
            default:
                this.f = str;
                this.g = hxh.c;
                this.h = new dwh();
                break;
            case 4:
                super(mwhVar, RequestUserBrowserTakeoverInput.Companion.serializer(), RequestUserBrowserTakeoverOutput.Companion.serializer());
                this.f = str;
                this.g = hxh.b;
                this.h = new dwh();
                break;
            case 5:
                super(mwhVar, RequestFormInputFromUserInput.Companion.serializer(), kei.b);
                this.f = str;
                this.g = hxh.a;
                this.h = new dwh();
                break;
        }
    }

    @Override // defpackage.dxh
    public void a(final String str, final dlb dlbVar, final boolean z, final e5h e5hVar, final iqb iqbVar, ld4 ld4Var, final int i) {
        r7e r7eVarS;
        pz7 pz7Var;
        String takeover_url;
        r7e r7eVarS2;
        pz7 pz7Var2;
        int i2 = this.e;
        lz1 lz1Var = jd4.a;
        int i3 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        switch (i2) {
            case 4:
                str.getClass();
                iqbVar.getClass();
                e18 e18Var = (e18) ld4Var;
                e18Var.c0(-249570438);
                int i4 = (i & 48) == 0 ? i | ((i & 64) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? 32 : 16) : i;
                if ((i & 24576) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(e5hVar) : e18Var.h(e5hVar)) {
                        i3 = 16384;
                    }
                    i4 |= i3;
                }
                if ((i & 196608) == 0) {
                    i4 |= e18Var.f(iqbVar) ? 131072 : 65536;
                }
                if (e18Var.Q(i4 & 1, (73745 & i4) != 73744)) {
                    RequestUserBrowserTakeoverOutput requestUserBrowserTakeoverOutput = (RequestUserBrowserTakeoverOutput) dlbVar.b();
                    if (requestUserBrowserTakeoverOutput == null || (takeover_url = requestUserBrowserTakeoverOutput.getTakeover_url()) == null) {
                        r7eVarS = e18Var.s();
                        if (r7eVarS != null) {
                            final int i5 = 0;
                            pz7Var = new pz7(this) { // from class: xie
                                public final /* synthetic */ tv0 F;

                                {
                                    this.F = this;
                                }

                                @Override // defpackage.pz7
                                public final Object invoke(Object obj, Object obj2) {
                                    int i6 = i5;
                                    iei ieiVar = iei.a;
                                    int i7 = i;
                                    switch (i6) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP0 = x44.p0(i7 | 1);
                                            this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP0);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP02 = x44.p0(i7 | 1);
                                            this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP02);
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                            r7eVarS.d = pz7Var;
                        }
                    } else {
                        if ((i4 & 57344) != 16384 && ((i4 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 || !e18Var.h(e5hVar))) {
                            z = false;
                        }
                        boolean zF = z | e18Var.f(takeover_url);
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new aac(e5hVar, 24, takeover_url);
                            e18Var.k0(objN);
                        }
                        ybi.a(((i4 >> 9) & 896) | 48, e18Var, (zy7) objN, null, iqbVar);
                    }
                } else {
                    e18Var.T();
                }
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i6 = 1;
                    pz7Var = new pz7(this) { // from class: xie
                        public final /* synthetic */ tv0 F;

                        {
                            this.F = this;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i62 = i6;
                            iei ieiVar = iei.a;
                            int i7 = i;
                            switch (i62) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i7 | 1);
                                    this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i7 | 1);
                                    this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                break;
            case 5:
                str.getClass();
                iqbVar.getClass();
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.c0(-2126637222);
                int i7 = (i & 6) == 0 ? (e18Var2.f(str) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i7 |= (i & 64) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? 32 : 16;
                }
                if ((i & 24576) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var2.f(e5hVar) : e18Var2.h(e5hVar)) {
                        i3 = 16384;
                    }
                    i7 |= i3;
                }
                if ((196608 & i) == 0) {
                    i7 |= e18Var2.f(iqbVar) ? 131072 : 65536;
                }
                if (e18Var2.Q(i7 & 1, (73747 & i7) != 73746)) {
                    RequestFormInputFromUserInput requestFormInputFromUserInput = (RequestFormInputFromUserInput) dlbVar.a();
                    if (requestFormInputFromUserInput == null) {
                        r7eVarS2 = e18Var2.s();
                        if (r7eVarS2 != null) {
                            final int i8 = 0;
                            pz7Var2 = new pz7(this) { // from class: wje
                                public final /* synthetic */ tv0 F;

                                {
                                    this.F = this;
                                }

                                @Override // defpackage.pz7
                                public final Object invoke(Object obj, Object obj2) {
                                    int i9 = i8;
                                    iei ieiVar = iei.a;
                                    int i10 = i;
                                    switch (i9) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP0 = x44.p0(i10 | 1);
                                            this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP0);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP02 = x44.p0(i10 | 1);
                                            this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP02);
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                            r7eVarS2.d = pz7Var2;
                        }
                    } else {
                        boolean zF2 = ((i7 & 57344) == 16384 || ((i7 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var2.h(e5hVar))) | ((i7 & 14) == 4) | e18Var2.f(requestFormInputFromUserInput);
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new hya(e5hVar, str, requestFormInputFromUserInput, 21);
                            e18Var2.k0(objN2);
                        }
                        f.c(((i7 >> 9) & 896) | 48, e18Var2, (zy7) objN2, null, iqbVar);
                    }
                } else {
                    e18Var2.T();
                }
                r7eVarS2 = e18Var2.s();
                if (r7eVarS2 != null) {
                    final int i9 = 1;
                    pz7Var2 = new pz7(this) { // from class: wje
                        public final /* synthetic */ tv0 F;

                        {
                            this.F = this;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i92 = i9;
                            iei ieiVar = iei.a;
                            int i10 = i;
                            switch (i92) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i10 | 1);
                                    this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i10 | 1);
                                    this.F.a(str, dlbVar, z, e5hVar, iqbVar, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS2.d = pz7Var2;
                }
                break;
            default:
                super.a(str, dlbVar, z, e5hVar, iqbVar, ld4Var, i);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x066f  */
    @Override // defpackage.dxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final java.lang.String r42, final java.lang.String r43, final boolean r44, final defpackage.dlb r45, final defpackage.lvh r46, final boolean r47, final boolean r48, final defpackage.iqb r49, defpackage.ld4 r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv0.c(java.lang.String, java.lang.String, boolean, dlb, lvh, boolean, boolean, iqb, ld4, int):void");
    }

    @Override // defpackage.dxh
    public String f(Context context, dlb dlbVar, boolean z, boolean z2) {
        CreateFileInput createFileInput;
        String path;
        switch (this.e) {
            case 1:
                String strD1 = (dlbVar == null || (createFileInput = (CreateFileInput) dlbVar.a()) == null || (path = createFileInput.getPath()) == null) ? null : bsg.d1('/', path, path);
                if (z2) {
                    String string = context.getString(R.string.create_file_tool_status_failed);
                    string.getClass();
                    return string;
                }
                if (strD1 == null) {
                    String string2 = z ? context.getString(R.string.create_file_tool_status_created) : context.getString(R.string.create_file_tool_status_creating);
                    string2.getClass();
                    return string2;
                }
                if (z) {
                    String string3 = context.getString(R.string.create_file_tool_status_created_named, strD1);
                    string3.getClass();
                    return string3;
                }
                String string4 = context.getString(R.string.create_file_tool_status_creating_named, strD1);
                string4.getClass();
                return string4;
            default:
                return super.f(context, dlbVar, z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r15 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.util.List r13, kotlinx.serialization.json.JsonObject r14, defpackage.tp4 r15) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.e
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r12 = super.i(r13, r14, r15)
            return r12
        La:
            boolean r0 = r15 instanceof defpackage.j3d
            if (r0 == 0) goto L1d
            r0 = r15
            j3d r0 = (defpackage.j3d) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1d
            int r1 = r1 - r2
            r0.H = r1
            goto L24
        L1d:
            j3d r0 = new j3d
            vp4 r15 = (defpackage.vp4) r15
            r0.<init>(r12, r15)
        L24:
            java.lang.Object r15 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L42
            if (r1 != r3) goto L3b
            java.util.List r12 = r0.E
            java.util.List r12 = (java.util.List) r12
            defpackage.sf5.h0(r15)
            goto L85
        L3b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            r15 = r2
            goto L85
        L42:
            java.util.List r13 = r0.E
            java.util.List r13 = (java.util.List) r13
            defpackage.sf5.h0(r15)
            goto L75
        L4a:
            defpackage.sf5.h0(r15)
            if (r14 == 0) goto L7a
            java.lang.String r7 = r14.toString()
            r14 = r13
            java.util.List r14 = (java.util.List) r14
            r0.E = r14
            r0.H = r4
            java.lang.String r10 = r12.r()
            mwh r8 = r12.a
            h86 r14 = r8.b
            e45 r14 = r14.getDefault()
            qq0 r6 = new qq0
            r11 = 0
            kotlinx.serialization.KSerializer r9 = r12.c
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r15 = defpackage.gb9.c0(r14, r6, r0)
            if (r15 != r5) goto L75
            goto L84
        L75:
            com.anthropic.claude.tool.model.PlacesMapDisplayV0Output r15 = (com.anthropic.claude.tool.model.PlacesMapDisplayV0Output) r15
            if (r15 == 0) goto L7a
            goto L85
        L7a:
            r0.E = r2
            r0.H = r3
            java.lang.Object r15 = r12.h(r13, r0)
            if (r15 != r5) goto L85
        L84:
            r15 = r5
        L85:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv0.i(java.util.List, kotlinx.serialization.json.JsonObject, tp4):java.lang.Object");
    }

    @Override // defpackage.dxh
    public final fwh n() {
        switch (this.e) {
        }
        return this.h;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        switch (this.e) {
        }
        return new twh(true);
    }

    @Override // defpackage.dxh
    public final int p() {
        switch (this.e) {
            case 0:
                ud0 ud0Var = ud0.d;
                ud0 ud0Var2 = ud0.d;
                return R.drawable.anthropicon_checklist;
            case 1:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                return R.drawable.anthropicon_file_add;
            case 2:
                return R.drawable.phosphor_map_trifold;
            case 3:
                ud0 ud0Var5 = ud0.d;
                ud0 ud0Var6 = ud0.d;
                return R.drawable.anthropicon_tool;
            case 4:
                ud0 ud0Var7 = ud0.d;
                ud0 ud0Var8 = ud0.d;
                return R.drawable.anthropicon_globe;
            default:
                ud0 ud0Var9 = ud0.d;
                ud0 ud0Var10 = ud0.d;
                return R.drawable.anthropicon_edit;
        }
    }

    @Override // defpackage.dxh
    public final String r() {
        switch (this.e) {
        }
        return this.g;
    }

    @Override // defpackage.dxh
    public final String s() {
        switch (this.e) {
        }
        return this.f;
    }

    @Override // defpackage.dxh
    public Object u(String str, vp4 vp4Var) {
        switch (this.e) {
            case 1:
                fuc fucVar = fuc.a;
                return new CreateFileInput(fucVar.b(str, "file_text"), fucVar.b(str, "path"));
            default:
                return super.u(str, vp4Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(String str, mwh mwhVar, int i) {
        super(mwhVar, CreateFileInput.Companion.serializer(), kei.b);
        this.e = i;
        switch (i) {
            case 3:
                super(mwhVar, PresentFilesInput.Companion.serializer(), kei.b);
                this.f = str;
                this.g = hxh.x;
                this.h = new dwh();
                break;
            default:
                this.f = str;
                this.g = hxh.y;
                this.h = new dwh();
                break;
        }
    }
}
