package defpackage;

import android.graphics.Typeface;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.anthropic.claude.design.icon.a;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlinx.serialization.json.JsonElement;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class prk {
    public static final ta4 a = new ta4(2056603228, false, new tb4(24));

    static {
        new ta4(-1256499092, false, new tb4(25));
    }

    public static final void a(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7 zy7Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1763816142);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarO = b.o(fqbVar, 40.0f);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new sy4(23, nwbVar);
                e18Var.k0(objN2);
            }
            iqb iqbVarC = androidx.compose.foundation.b.c(iqbVarO, false, null, null, null, (zy7) objN2, 15);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cv8.b(a.a(ud0.c0, e18Var), d4c.j0(R.string.generic_button_more_options, e18Var), b.o(fqbVar, 20.0f), gm3.a(e18Var).M, e18Var, 392, 0);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new sy4(24, nwbVar);
                e18Var.k0(objN3);
            }
            zy7Var3 = zy7Var;
            t30.a(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, gm3.a(e18Var).o, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1194547207, new vv4(zy7Var3, zy7Var2, nwbVar, 1), e18Var), e18Var, 48, 48, 1916);
            e18Var.p(true);
        } else {
            zy7Var3 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, 3, zy7Var3, zy7Var2);
        }
    }

    public static final void b(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(227211092);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, null, gm3.a(e18Var2).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var, i2 & 14, 0, 131066);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 5);
        }
    }

    public static final void c(int i, ld4 ld4Var, String str, boolean z) {
        int i2;
        String str2;
        e18 e18Var;
        long j;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(193435206);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(new ho0(6.0f, true, new sz6(i3)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, i2 & 14, 0, 131066);
            if (z) {
                e18Var2.a0(-1595563767);
                j = gm3.a(e18Var2).j;
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1595497458);
                j = gm3.a(e18Var2).b;
                e18Var2.p(false);
            }
            long j2 = j;
            String strJ0 = d4c.j0(z ? R.string.internal_setting_growthbook_editor_badge_override : R.string.internal_setting_growthbook_editor_badge_server, e18Var2);
            iqb iqbVarK = gb9.K(yfd.p(fqbVar, d54.b(0.15f, j2), xve.b(6.0f)), 8.0f, 4.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarK);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            str2 = str;
            tjh.b(strJ0, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            str2 = str;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ev0(str2, z, i);
        }
    }

    public static final wba d(Typeface typeface) {
        return new wba(new v60(typeface, 0));
    }

    public static final void e(String str, zy7 zy7Var, iqb iqbVar, qc8 qc8Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qc8 qc8Var2;
        qc8 qc8Var3;
        int i2;
        iqb iqbVar3;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(546804394);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 1408;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB) | ((((i3 & 14) ^ 6) > 4 && e18Var.f(str)) || (i3 & 6) == 4);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new jy5(m7fVarB, str);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                qc8Var3 = (qc8) fd9.r0(kceVar.b(qc8.class), oq5.B(kceVar.b(qc8.class)), (bz7) objN, e18Var);
                i2 = i3 & (-7169);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                iqbVar3 = iqbVar;
                qc8Var3 = qc8Var;
            }
            int i4 = i2;
            e18Var.q();
            String str2 = (String) qc8Var3.g.getValue();
            String str3 = (String) qc8Var3.h.getValue();
            qc8 qc8Var4 = qc8Var3;
            iqb iqbVar4 = iqbVar3;
            ssj.c(d4c.j0(R.string.internal_setting_growthbook_editor_title, e18Var), zy7Var, iqbVar4, fd9.q0(-1965573159, new nn(23, qc8Var3), e18Var), null, 0L, fd9.q0(-487301509, new xe(str2, qc8Var3, d4c.j0(R.string.internal_setting_growthbook_editor_unknown_save_error, e18Var), str, str3, 18), e18Var), e18Var, (i4 & 112) | 1576320, 48);
            iqbVar2 = iqbVar4;
            qc8Var2 = qc8Var4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qc8Var2 = qc8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(str, zy7Var, iqbVar2, qc8Var2, i, 9);
        }
    }

    public static final void f(List list, List list2, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, iqb iqbVar, qnc qncVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        fqb fqbVar;
        char c;
        zy7 zy7Var;
        list2.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1666484854);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(list2) : e18Var.h(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(bz7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(bz7Var4) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= e18Var.f(qncVar) ? 8388608 : 4194304;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(i4));
            j9f j9fVarY = mpk.Y(e18Var);
            fqb fqbVar2 = fqb.E;
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(fqbVar2, j9fVarY, false), qncVar), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            lz1 lz1Var = jd4.a;
            float f = 120.0f;
            if (list == null) {
                e18Var.a0(1040048518);
                e18Var.p(false);
                iqbVar2 = fqbVar2;
            } else {
                boolean z = false;
                e18Var.a0(1040048519);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MessageFile messageFile = (MessageFile) it.next();
                    if (messageFile instanceof MessageImageFile) {
                        e18Var.a0(-424751297);
                        MessageImageFile messageImageFile = (MessageImageFile) messageFile;
                        boolean z2 = z;
                        MessageImageAsset thumbnail_asset = messageImageFile.getThumbnail_asset();
                        String file_name = messageImageFile.getFile_name();
                        iqb iqbVarE2 = puk.e(b.o(fqbVar2, f));
                        boolean zH = ((i3 & 896) == 256 ? true : z2) | e18Var.h(messageFile);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new ft9(bz7Var, 21, messageImageFile);
                            e18Var.k0(objN);
                        }
                        fqbVar = fqbVar2;
                        com.anthropic.claude.chat.input.images.a.b(thumbnail_asset, androidx.compose.foundation.b.c(iqbVarE2, false, null, null, null, (zy7) objN, 15), null, file_name, e18Var, 0, 4);
                        e18Var.p(z2);
                        z = z2;
                    } else {
                        fqbVar = fqbVar2;
                        if (messageFile instanceof MessageDocumentFile) {
                            e18Var.a0(-424319870);
                            MessageDocumentFile messageDocumentFile = (MessageDocumentFile) messageFile;
                            String file_name2 = messageDocumentFile.getFile_name();
                            file_name2.getClass();
                            String strI1 = bsg.i1('.', file_name2, file_name2);
                            String file_name3 = messageDocumentFile.getFile_name();
                            file_name3.getClass();
                            String strD1 = bsg.d1('.', file_name3, "");
                            if (strD1.length() == 0) {
                                strD1 = null;
                            }
                            MessageImageAsset thumbnail_asset2 = messageDocumentFile.getThumbnail_asset();
                            boolean zH2 = e18Var.h(messageFile) | ((i3 & 7168) == 2048);
                            Object objN2 = e18Var.N();
                            if (zH2 || objN2 == lz1Var) {
                                objN2 = new ft9(bz7Var2, 22, messageDocumentFile);
                                e18Var.k0(objN2);
                            }
                            e18 e18Var2 = e18Var;
                            bj7.f(strI1, strD1, null, (zy7) objN2, thumbnail_asset2, null, null, new va6(120.0f), e18Var2, 12582912, 100);
                            e18Var = e18Var2;
                            z = false;
                            e18Var.p(false);
                        } else {
                            if (messageFile instanceof MessageBlobFile) {
                                e18Var.a0(1925987553);
                                MessageBlobFile messageBlobFile = (MessageBlobFile) messageFile;
                                String file_name4 = messageBlobFile.getFile_name();
                                file_name4.getClass();
                                String strI12 = bsg.i1('.', file_name4, file_name4);
                                String file_name5 = messageBlobFile.getFile_name();
                                file_name5.getClass();
                                String strD12 = bsg.d1('.', file_name5, "");
                                if (strD12.length() == 0) {
                                    strD12 = null;
                                }
                                boolean zH3 = e18Var.h(messageFile) | ((57344 & i3) == 16384);
                                Object objN3 = e18Var.N();
                                if (zH3 || objN3 == lz1Var) {
                                    objN3 = new ft9(bz7Var3, 23, messageBlobFile);
                                    e18Var.k0(objN3);
                                }
                                e18 e18Var3 = e18Var;
                                bj7.f(strI12, strD12, null, (zy7) objN3, null, null, null, new va6(120.0f), e18Var3, 12582912, 116);
                                e18Var = e18Var3;
                                z = false;
                                e18Var.p(false);
                            } else {
                                if (!(messageFile instanceof MessageUnknownFile)) {
                                    throw ebh.u(e18Var, 1925959584, false);
                                }
                                e18Var.a0(1925998103);
                                bj7.i(((MessageUnknownFile) messageFile).getFile_name(), null, null, new va6(120.0f), e18Var, 3072, 6);
                                z = false;
                                e18Var.p(false);
                            }
                            fqbVar2 = fqbVar;
                            f = 120.0f;
                        }
                    }
                    fqbVar2 = fqbVar;
                    f = 120.0f;
                }
                iqbVar2 = fqbVar2;
                e18Var.p(z);
            }
            e18Var.a0(-1213333074);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                MessageAttachment messageAttachment = (MessageAttachment) it2.next();
                if (messageAttachment.m232getId4Lkzfcw() == null) {
                    e18Var.a0(687762965);
                    e18Var.p(false);
                    zy7Var = null;
                    c = 0;
                } else {
                    e18Var.a0(687762966);
                    c = 0;
                    boolean zF = e18Var.f(messageAttachment) | ((458752 & i3) == 131072);
                    Object objN4 = e18Var.N();
                    if (zF || objN4 == lz1Var) {
                        objN4 = new ft9(bz7Var4, 24, messageAttachment);
                        e18Var.k0(objN4);
                    }
                    zy7Var = (zy7) objN4;
                    e18Var.p(false);
                }
                bj7.e(messageAttachment, null, zy7Var, new va6(120.0f), e18Var, 3072);
                i3 = i3;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we(list, list2, bz7Var, bz7Var2, bz7Var3, bz7Var4, iqbVar2, qncVar, i, 3);
        }
    }

    public static final void g(qc8 qc8Var, String str, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1023963673);
        int i2 = (e18Var.f(qc8Var) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16);
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_override_label, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            if (str != null) {
                e18Var.a0(2044397693);
                j = gm3.a(e18Var).z;
                e18Var.p(false);
            } else {
                e18Var.a0(2044447169);
                j = gm3.a(e18Var).q;
                e18Var.p(false);
            }
            bg1.a(qc8Var.f, gb9.J(ez1.t(yfd.p(b.g(b.c(fqb.E, 1.0f), 240.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).o, xve.b(10.0f)), 1.0f, j, xve.b(10.0f)), 12.0f), false, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, gm3.a(e18Var).M, 0L, null, null, xt7.H, 0L, null, 0, 0L, null, 0, 16777182), new mp9(i3, 2, i3, 120), null, null, null, null, null, e18Var, 0, 32668);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(i, 18, qc8Var, str);
        }
    }

    public static final void h(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(710710354);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var).n, zni.b), 16.0f, 12.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vve vveVarB = xve.b(12.0f);
            qnc qncVar = q02.a;
            lnk.d(zy7Var, b.c(fqbVar, 1.0f), z, vveVarB, q02.a(gm3.a(e18Var).b, gm3.a(e18Var).n, gm3.a(e18Var).q, gm3.a(e18Var).O, e18Var, 0), new qnc(24.0f, 14.0f, 24.0f, 14.0f), null, cmk.c, e18Var, ((i2 >> 3) & 14) | 806879280 | ((i2 << 6) & 896), 416);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(z, zy7Var, i, 3);
        }
    }

    public static final void i(qc8 qc8Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1081028050);
        int i2 = i | (e18Var.f(qc8Var) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_server_value_label, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            String strJ0 = d4c.j0(R.string.internal_setting_growthbook_editor_server_value_empty, e18Var);
            iqb iqbVarJ = gb9.J(yfd.p(b.c(fqb.E, 1.0f), gm3.a(e18Var).o, xve.b(8.0f)), 12.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            String strA = cc8.a((JsonElement) qc8Var.d.getValue());
            if (strA.length() != 0) {
                strJ0 = strA;
            }
            tjh.b(strJ0, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, 0L, 0L, null, null, xt7.H, 0L, null, 0, 0L, null, 0, 16777183), e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mk4(qc8Var, i, 21);
        }
    }

    public static final void j(zb0 zb0Var, iqb iqbVar, tkh tkhVar, final bpc bpcVar, dv8 dv8Var, long j, float f, long j2, int i, int i2, ld4 ld4Var, int i3, int i4) {
        int i5;
        tkh tkhVar2;
        int i6;
        e18 e18Var;
        long jD;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-538853629);
        if ((i3 & 6) == 0) {
            i5 = (e18Var2.f(zb0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            tkhVar2 = tkhVar;
            i5 |= e18Var2.f(tkhVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            tkhVar2 = tkhVar;
        }
        if ((i3 & 3072) == 0) {
            i5 |= (i3 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(bpcVar) : e18Var2.h(bpcVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i3 & 24576) == 0) {
            i5 |= e18Var2.d(dv8Var.ordinal()) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i3) == 0) {
            i5 |= e18Var2.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= e18Var2.c(f) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= e18Var2.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= e18Var2.d(i) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= e18Var2.d(i2) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (e18Var2.f(null) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (e18Var2.Q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            e18Var2.V();
            if ((i3 & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            if (bpcVar == null) {
                e18Var2.a0(1599757926);
                tjh.c(zb0Var, iqbVar, 0L, 0L, 0L, null, 0L, i2, false, i, 0, null, null, tkhVar2, e18Var2, i5 & 126, (i6 & 14) | ((i5 >> 21) & 896) | ((i5 >> 12) & 57344) | ((i5 << 18) & 234881024), 240636);
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                e18Var2.a0(1600020496);
                umg umgVar = ve4.h;
                final float fD = ((cz5) e18Var2.j(umgVar)).D(j);
                long jR = ((cz5) e18Var2.j(umgVar)).r(f);
                e18Var2.a0(1852733030);
                if (j2 != 16) {
                    jD = j2;
                } else {
                    e18Var2.a0(1852733803);
                    jD = tkhVar.d();
                    if (jD == 16) {
                        jD = ((d54) e18Var2.j(on4.a)).a;
                    }
                    e18Var2.p(false);
                }
                e18Var2.p(false);
                xb0 xb0Var = new xb0();
                int i7 = i5;
                if (dv8Var == dv8.E) {
                    qvk.b(xb0Var, "icon", "�");
                    xb0Var.h(isg.m0((int) (clh.c(jR) / 2.0f), " "));
                }
                xb0Var.e(zb0Var);
                if (dv8Var == dv8.F) {
                    xb0Var.h(isg.m0((int) (clh.c(jR) / 2.0f), " "));
                    qvk.b(xb0Var, "icon", "�");
                }
                zb0 zb0VarN = xb0Var.n();
                final long j3 = jD;
                Map mapSingletonMap = Collections.singletonMap("icon", new t39(new f3d(j, 4, j), fd9.q0(-60942138, new rz7() { // from class: jlh
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ld4 ld4Var2 = (ld4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((String) obj).getClass();
                        e18 e18Var3 = (e18) ld4Var2;
                        if (e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            cv8.b(bpcVar, null, b.o(fqb.E, fD), j3, e18Var3, 56, 0);
                        } else {
                            e18Var3.T();
                        }
                        return iei.a;
                    }
                }, e18Var2)));
                mapSingletonMap.getClass();
                tjh.c(zb0VarN, iqbVar, 0L, 0L, 0L, null, 0L, i2, false, i, 0, mapSingletonMap, null, tkhVar, e18Var2, i7 & 112, (i6 & 14) | ((i7 >> 21) & 896) | ((i7 >> 12) & 57344) | ((i7 << 18) & 234881024), 175100);
                e18Var = e18Var2;
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ilh(zb0Var, iqbVar, tkhVar, bpcVar, dv8Var, j, f, j2, i, i2, i3, i4, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(java.lang.String r20, defpackage.iqb r21, defpackage.tkh r22, defpackage.bpc r23, defpackage.dv8 r24, long r25, float r27, long r28, int r30, int r31, defpackage.ld4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prk.k(java.lang.String, iqb, tkh, bpc, dv8, long, float, long, int, int, ld4, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r3 - r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int l(boolean r2, int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 < r5) goto L8
            if (r2 == 0) goto L6
            return r0
        L6:
            int r5 = r5 - r4
            return r5
        L8:
            if (r2 != 0) goto Ld
            if (r4 > r3) goto L16
            goto L11
        Ld:
            int r1 = r5 - r4
            if (r1 <= r3) goto L16
        L11:
            if (r2 == 0) goto L14
            goto L21
        L14:
            int r3 = r3 - r4
            return r3
        L16:
            if (r2 == 0) goto L1b
            if (r4 > r3) goto L24
            goto L1f
        L1b:
            int r1 = r5 - r4
            if (r1 <= r3) goto L24
        L1f:
            if (r2 != 0) goto L22
        L21:
            return r3
        L22:
            int r3 = r3 - r4
            return r3
        L24:
            if (r2 != 0) goto L27
            return r0
        L27:
            int r5 = r5 - r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prk.l(boolean, int, int, int):int");
    }

    public static hpe m(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            String strM2 = qh9Var.s("type").m();
            strM2.getClass();
            for (int i : sq6.H(3)) {
                if (grc.g(i).equals(strM2)) {
                    bh9 bh9VarS = qh9Var.s("has_replay");
                    Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
                    strM.getClass();
                    return new hpe(strM, i, boolValueOf);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ResourceEventSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ResourceEventSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ResourceEventSession", e3);
            return null;
        }
    }

    public static final xlk n(hmk hmkVar) throws zzhj {
        try {
            fmk fmkVarF = hmkVar.f();
            if (fmkVarF == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = fmkVarF.b;
                byte b2 = fmkVarF.a;
                int i = 0;
                if (b2 == -128) {
                    long jC = hmkVar.c();
                    if (jC > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    o(b, jC);
                    xlk[] xlkVarArr = new xlk[(int) jC];
                    while (i < jC) {
                        xlkVarArr[i] = n(hmkVar);
                        i++;
                    }
                    return new qkk(pzj.r(xlkVarArr));
                }
                try {
                    if (b2 != -96) {
                        if (b2 == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b2 == -32) {
                            return new vkk(hmkVar.i());
                        }
                        if (b2 == 0 || b2 == 32) {
                            long jD = hmkVar.d();
                            o(b, jD > 0 ? jD : ~jD);
                            return new ilk(jD);
                        }
                        if (b2 == 64) {
                            hmkVar.x((byte) 64);
                            byte[] bArrK = hmkVar.K();
                            int length = bArrK.length;
                            o(b, length);
                            return new alk(wik.m(bArrK, length));
                        }
                        if (b2 != 96) {
                            throw new zzhj("Unidentifiable major type: " + ((b2 >> 5) & 7));
                        }
                        hmkVar.x((byte) 96);
                        String str = new String(hmkVar.K(), StandardCharsets.UTF_8);
                        o(b, str.length());
                        return new qlk(str);
                    }
                    long jE = hmkVar.e();
                    if (jE > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    o(b, jE);
                    int i2 = (int) jE;
                    ire[] ireVarArr = new ire[i2];
                    xlk xlkVar = null;
                    int i3 = 0;
                    while (i3 < jE) {
                        xlk xlkVarN = n(hmkVar);
                        if (xlkVar != null && xlkVarN.compareTo(xlkVar) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + xlkVar.toString() + "\nCurrent key: " + xlkVarN.toString());
                        }
                        ireVarArr[i3] = new ire(xlkVarN, 13, n(hmkVar));
                        i3++;
                        xlkVar = xlkVarN;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        ire ireVar = ireVarArr[i];
                        if (treeMap.containsKey((xlk) ireVar.F)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((xlk) ireVar.F, (xlk) ireVar.G);
                        i++;
                    }
                    return new llk(o0k.c(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new zzhj(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new zzhj(e3);
        }
    }

    public static final void o(byte b, long j) throws zzhf {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new zzhf(grc.q(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case BuildConfig.VERSION_CODE /* 25 */:
                if (j < 256) {
                    throw new zzhf(grc.q(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new zzhf(grc.q(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new zzhf(grc.q(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
