package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.av;
import defpackage.bsg;
import defpackage.dj7;
import defpackage.dnd;
import defpackage.e18;
import defpackage.ebh;
import defpackage.end;
import defpackage.fd9;
import defpackage.fnd;
import defpackage.gwj;
import defpackage.iw0;
import defpackage.jd4;
import defpackage.jwj;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.mwa;
import defpackage.mwj;
import defpackage.oob;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.rwj;
import defpackage.sz7;
import defpackage.ta4;
import defpackage.yed;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(fnd fndVar, zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2 = zy7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1894683422);
        int i2 = (e18Var.f(fndVar) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ta4 ta4VarQ0 = fd9.q0(-951027962, new yed(fndVar, zy7Var2), e18Var);
            if (fndVar instanceof dnd) {
                e18Var.a0(54094421);
                dnd dndVar = (dnd) fndVar;
                String content = dndVar.e.getContent();
                if (content == null) {
                    content = "";
                }
                if (bsg.I0(content) || content.length() > 2000000) {
                    e18Var.a0(54477271);
                    ta4VarQ0.invoke(e18Var, 6);
                    e18Var.p(false);
                } else {
                    e18Var.a0(54535210);
                    rwj.c(dndVar.b, content, zy7Var2, null, e18Var, ((i2 << 6) & 7168) | 384);
                    e18Var.p(false);
                }
                e18Var.p(false);
                zy7Var2 = zy7Var;
            } else {
                if (!(fndVar instanceof end)) {
                    throw ebh.u(e18Var, -275350376, false);
                }
                e18Var.a0(54920354);
                end endVar = (end) fndVar;
                MessageFile messageFile = endVar.e;
                boolean z = messageFile instanceof MessageImageFile;
                dj7 dj7Var = dj7.a;
                if (z) {
                    e18Var.a0(55043951);
                    MessageImageAsset messageImageAsset = endVar.f;
                    if (messageImageAsset == null) {
                        e18Var.a0(55110663);
                        ta4VarQ0.invoke(e18Var, 6);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(55219535);
                        String strMo236getFile_uuidExWXDbg = ((MessageImageFile) messageFile).mo236getFile_uuidExWXDbg();
                        String str = endVar.b;
                        Object objN = e18Var.N();
                        lz1 lz1Var = jd4.a;
                        if (objN == lz1Var) {
                            objN = new oob(19);
                            e18Var.k0(objN);
                        }
                        zy7 zy7Var3 = (zy7) objN;
                        Object objN2 = e18Var.N();
                        if (objN2 == lz1Var) {
                            objN2 = new oob(19);
                            e18Var.k0(objN2);
                        }
                        mwj.c(messageImageAsset, dj7Var, zy7Var3, zy7Var, (zy7) objN2, null, str, strMo236getFile_uuidExWXDbg, false, false, e18Var, ((i2 << 6) & 7168) | 25008, 800);
                        e18Var = e18Var;
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                    zy7Var2 = zy7Var;
                } else if (messageFile instanceof MessageDocumentFile) {
                    e18Var.a0(-275292022);
                    zy7Var2 = zy7Var;
                    jwj.b((MessageDocumentFile) messageFile, dj7Var, zy7Var2, null, e18Var, ((i2 << 3) & 896) | 48);
                    e18Var.p(false);
                } else if (messageFile instanceof MessageBlobFile) {
                    e18Var.a0(-275285238);
                    zy7Var2 = zy7Var;
                    gwj.b((MessageBlobFile) messageFile, dj7Var, zy7Var2, null, e18Var, ((i2 << 3) & 896) | 48);
                    e18Var.p(false);
                } else {
                    zy7Var2 = zy7Var;
                    if (!(messageFile instanceof MessageUnknownFile)) {
                        throw ebh.u(e18Var, -275320756, false);
                    }
                    e18Var.a0(-275278517);
                    ta4VarQ0.invoke(e18Var, 6);
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yed(fndVar, zy7Var2, i);
        }
    }

    public static final void b(rwe rweVar, final List list, final List list2, final boolean z, final boolean z2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1953465204);
        int i2 = i | (e18Var.f(rweVar) ? 4 : 2) | (e18Var.f(list) ? 32 : 16) | (e18Var.f(list2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new av(rweVar, 24);
                e18Var.k0(objN);
            }
            final zy7 zy7Var = (zy7) objN;
            mwa.l(rweVar, null, null, fd9.q0(447505694, new sz7() { // from class: xed
                /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
                @Override // defpackage.sz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object i(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
                    /*
                        Method dump skipped, instruction units count: 398
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.xed.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var), e18Var, i3 | 3072, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(rweVar, list, list2, z, z2, i);
        }
    }
}
