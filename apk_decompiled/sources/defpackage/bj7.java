package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bj7 {
    public static final long a;
    public static final long b;
    public static final /* synthetic */ int c = 0;

    static {
        lz1 lz1Var = uh6.F;
        a = v40.Q(400, zh6.MILLISECONDS);
        b = v40.Q(1, zh6.SECONDS);
    }

    public static final void a(Float f, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-971633193);
        int i2 = (e18Var2.f(f) ? 4 : 2) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            Boolean bool = (Boolean) e18Var2.j(p59.a);
            bool.getClass();
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(bool);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            int i3 = 14;
            int i4 = i2 & 14;
            nwb nwbVarZ = mpk.Z(f, e18Var2);
            if (f == null || ((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var2.a0(-2139032469);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-2139475490);
                boolean zF = e18Var2.f(nwbVarZ);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = new sd1(nwbVarZ, nwbVar, null, i);
                    e18Var2.k0(objN2);
                }
                fd9.i(e18Var2, (pz7) objN2, iei.a);
                e18Var2.p(false);
            }
            if (f == null || !((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var2.a0(-2138931192);
                ez1.a(null, null, 0L, e18Var2, 0, 7);
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                e18Var2.a0(-2138992045);
                i = i4 != 4 ? 0 : 1;
                Object objN3 = e18Var2.N();
                if (i != 0 || objN3 == lz1Var) {
                    objN3 = new xi4(i3, f);
                    e18Var2.k0(objN3);
                }
                e18Var = e18Var2;
                ez1.b((zy7) objN3, null, null, 0L, e18Var, 0);
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zi7(f, i);
        }
    }

    public static final void b(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(568094065);
        int i2 = (e18Var2.f(str) ? 4 : 2) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            String str2 = str == null ? "" : str;
            e18Var = e18Var2;
            tjh.b(str2, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, new fdh(5), 0L, 2, false, 3, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 0, 24960, 109562);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 1);
        }
    }

    public static final void c(mw2 mw2Var, zy7 zy7Var, va6 va6Var, ld4 ld4Var, int i) {
        int i2;
        mw2Var.getClass();
        String str = mw2Var.c;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1485853865);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(va6Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            str.getClass();
            String strI1 = bsg.i1('.', str, str);
            String strD1 = bsg.d1('.', str, "");
            if (strD1.length() == 0) {
                strD1 = null;
            }
            f(strI1, strD1, fqbVar, zy7Var, mw2Var.b.getThumbnail_asset(), null, null, va6Var, e18Var, ((i2 << 3) & 8064) | ((i2 << 12) & 29360128), 96);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(mw2Var, zy7Var, va6Var, i);
        }
    }

    public static final void d(ow2 ow2Var, zy7 zy7Var, va6 va6Var, ld4 ld4Var, int i) {
        int i2;
        va6 va6Var2;
        String strI1;
        String str;
        zy7 zy7Var2 = zy7Var;
        ow2Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-954974502);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ow2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i2 | 3072;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            va6Var2 = new va6(96.0f);
            boolean z = ow2Var instanceof kw2;
            boolean z2 = true;
            fj7 fj7Var = fj7.E;
            if (z) {
                e18Var.a0(218243155);
                kw2 kw2Var = (kw2) ow2Var;
                lsc lscVar = kw2Var.b;
                String str2 = (String) lscVar.getValue();
                String strI12 = str2 != null ? bsg.i1('.', str2, str2) : null;
                String str3 = (String) lscVar.getValue();
                if (str3 != null) {
                    String strD1 = bsg.d1('.', str3, "");
                    if (strD1.length() != 0) {
                        str = strD1;
                    }
                }
                if (kw2Var.l() != null) {
                    fj7Var = fj7.G;
                } else if (kw2Var.e()) {
                    fj7Var = fj7.F;
                }
                f(strI12, str, fqbVar, zy7Var2, null, fj7Var, (Float) kw2Var.e.getValue(), va6Var2, e18Var, ((i4 << 3) & 8064) | ((i4 << 12) & 29360128), 16);
                e18Var.p(false);
            } else if (ow2Var instanceof mw2) {
                e18Var.a0(218896418);
                c((mw2) ow2Var, zy7Var2, va6Var2, e18Var, i4 & 8190);
                e18Var.p(false);
            } else {
                if (ow2Var instanceof lw2) {
                    e18Var.a0(219046489);
                    MessageBlobFile messageBlobFile = ((lw2) ow2Var).b;
                    String file_name = messageBlobFile.getFile_name();
                    file_name.getClass();
                    String strI13 = bsg.i1('.', file_name, file_name);
                    String file_name2 = messageBlobFile.getFile_name();
                    file_name2.getClass();
                    String strD12 = bsg.d1('.', file_name2, "");
                    if (strD12.length() == 0) {
                        strD12 = null;
                    }
                    f(strI13, strD12, fqbVar, zy7Var2, null, null, null, va6Var2, e18Var, ((i4 << 3) & 8064) | ((i4 << 12) & 29360128), 112);
                    e18Var.p(false);
                } else if (ow2Var instanceof nw2) {
                    e18Var.a0(219424999);
                    i(((nw2) ow2Var).c, fqbVar, zy7Var, va6Var2, e18Var, i4 & 8176, 0);
                    e18Var.p(false);
                } else {
                    if (!(ow2Var instanceof jw2)) {
                        throw ebh.u(e18Var, 1392512375, false);
                    }
                    e18Var.a0(219595282);
                    String str4 = ((jw2) ow2Var).c;
                    if (str4.length() != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        strI1 = vb7.n(e18Var, 219710664, R.string.chat_input_pasted_content_label, e18Var, false);
                    } else {
                        e18Var.a0(219811848);
                        e18Var.p(false);
                        strI1 = bsg.i1('.', str4, str4);
                    }
                    if (z2) {
                        str = "txt";
                    } else {
                        String strD13 = bsg.d1('.', str4, "");
                        str = strD13.length() != 0 ? strD13 : null;
                    }
                    int i5 = i4 << 3;
                    int i6 = (i5 & 7168) | (i5 & 896) | 196608 | ((i4 << 12) & 29360128);
                    String str5 = strI1;
                    zy7Var2 = zy7Var;
                    f(str5, str, fqbVar, zy7Var2, null, fj7Var, null, va6Var2, e18Var, i6, 80);
                    e18Var.p(false);
                }
                zy7Var2 = zy7Var;
            }
        } else {
            e18Var.T();
            va6Var2 = va6Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(ow2Var, zy7Var2, va6Var2, i);
        }
    }

    public static final void e(MessageAttachment messageAttachment, iqb iqbVar, zy7 zy7Var, va6 va6Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String strI1;
        String strD1;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1849659873);
        int i2 = i | (e18Var.f(messageAttachment) ? 4 : 2) | 48 | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = messageAttachment.getFile_name().length() == 0;
            if (z) {
                strI1 = vb7.n(e18Var, 1213398483, R.string.chat_input_pasted_content_label, e18Var, false);
            } else {
                e18Var.a0(1213483826);
                e18Var.p(false);
                String file_name = messageAttachment.getFile_name();
                file_name.getClass();
                strI1 = bsg.i1('.', file_name, file_name);
            }
            if (z) {
                strD1 = "txt";
            } else {
                String file_name2 = messageAttachment.getFile_name();
                file_name2.getClass();
                strD1 = bsg.d1('.', file_name2, "");
                if (strD1.length() == 0) {
                    strD1 = null;
                }
            }
            int i3 = ((i2 << 3) & 8064) | 12582912;
            String str = strI1;
            fqb fqbVar = fqb.E;
            f(str, strD1, fqbVar, zy7Var, null, null, null, va6Var, e18Var, i3, 112);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(messageAttachment, iqbVar2, zy7Var, va6Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089 A[PHI: r14
      0x0089: PHI (r14v18 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:51:0x0087, B:61:0x009f, B:60:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r30, java.lang.String r31, defpackage.iqb r32, defpackage.zy7 r33, java.lang.Object r34, defpackage.fj7 r35, java.lang.Float r36, defpackage.va6 r37, defpackage.ld4 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.f(java.lang.String, java.lang.String, iqb, zy7, java.lang.Object, fj7, java.lang.Float, va6, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.pz7 r20, defpackage.ta4 r21, defpackage.iqb r22, defpackage.zy7 r23, defpackage.pz7 r24, defpackage.va6 r25, defpackage.ld4 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.g(pz7, ta4, iqb, zy7, pz7, va6, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r15, int r16, defpackage.ld4 r17, defpackage.iqb r18, java.lang.String r19) {
        /*
            r1 = r19
            r1.getClass()
            r12 = r17
            e18 r12 = (defpackage.e18) r12
            r0 = -806556639(0xffffffffcfecec21, float:-7.949796E9)
            r12.c0(r0)
            r0 = r15 & 6
            r2 = 4
            if (r0 != 0) goto L1f
            boolean r0 = r12.f(r1)
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r15
            goto L20
        L1f:
            r0 = r15
        L20:
            r3 = r16 & 2
            if (r3 == 0) goto L29
            r0 = r0 | 48
        L26:
            r4 = r18
            goto L3b
        L29:
            r4 = r15 & 48
            if (r4 != 0) goto L26
            r4 = r18
            boolean r5 = r12.f(r4)
            if (r5 == 0) goto L38
            r5 = 32
            goto L3a
        L38:
            r5 = 16
        L3a:
            r0 = r0 | r5
        L3b:
            r5 = r0 & 19
            r6 = 18
            if (r5 == r6) goto L43
            r5 = 1
            goto L44
        L43:
            r5 = 0
        L44:
            r6 = r0 & 1
            boolean r5 = r12.Q(r6, r5)
            if (r5 == 0) goto L8d
            if (r3 == 0) goto L51
            fqb r3 = defpackage.fqb.E
            goto L52
        L51:
            r3 = r4
        L52:
            jl3 r4 = defpackage.gm3.a(r12)
            long r4 = r4.n
            jl3 r6 = defpackage.gm3.a(r12)
            long r6 = r6.N
            cm3 r8 = defpackage.gm3.b(r12)
            e0g r8 = r8.d
            jl3 r9 = defpackage.gm3.a(r12)
            long r9 = r9.u
            r11 = 0
            qu1 r10 = defpackage.sf5.a(r11, r9)
            yi7 r9 = new yi7
            r9.<init>(r1, r2)
            r2 = 515657596(0x1ebc4f7c, float:1.9938148E-20)
            ta4 r11 = defpackage.fd9.q0(r2, r9, r12)
            int r0 = r0 >> 3
            r0 = r0 & 14
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = r0 | r2
            r14 = 48
            r2 = r3
            r3 = r8
            r8 = 0
            r9 = 0
            defpackage.pzg.a(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            goto L91
        L8d:
            r12.T()
            r2 = r4
        L91:
            r7e r6 = r12.s()
            if (r6 == 0) goto La2
            sf2 r0 = new sf2
            r5 = 2
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.h(int, int, ld4, iqb, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r15, defpackage.iqb r16, defpackage.zy7 r17, defpackage.va6 r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.i(java.lang.String, iqb, zy7, va6, ld4, int, int):void");
    }
}
