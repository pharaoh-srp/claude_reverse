package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ked implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ MessageDocumentFile F;
    public final /* synthetic */ hed G;

    public /* synthetic */ ked(hed hedVar, MessageDocumentFile messageDocumentFile) {
        this.G = hedVar;
        this.F = messageDocumentFile;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        hed hedVar = this.G;
        MessageDocumentFile messageDocumentFile = this.F;
        switch (i) {
            case 0:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    String strJ0 = d4c.j0(R.string.document_preview_bottom_sheet_download_button, e18Var);
                    iqb iqbVarM = ttj.m(b.c(fqbVar, 1.0f), i4gVar);
                    boolean zF = e18Var.f(hedVar) | e18Var.f(messageDocumentFile);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new jed(hedVar, messageDocumentFile, 1);
                        e18Var.k0(objN);
                    }
                    dtj.a(strJ0, iqbVarM, false, null, null, null, 0L, (zy7) objN, e18Var, 0, 124);
                }
                break;
            default:
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarN = gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    MessageImageAsset messageImageAssetD = nkk.d(messageDocumentFile);
                    nw1 nw1Var = nw1.a;
                    if (messageImageAssetD != null) {
                        e18Var2.a0(-1903767851);
                        tnk.d(messageImageAssetD, gb9.N(nw1Var.a(b.c(fqbVar, 1.0f), lja.K), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), messageDocumentFile.getFile_name(), e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1903467585);
                        e18Var2.p(false);
                    }
                    iv1.c(hedVar.g, nw1Var.a(b.c(fqbVar, 1.0f), lja.N), e18Var2, 0, 0);
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ked(MessageDocumentFile messageDocumentFile, hed hedVar) {
        this.F = messageDocumentFile;
        this.G = hedVar;
    }
}
