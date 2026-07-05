package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.SourceImage;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zq9 {
    public static final qnc a = new qnc(12.0f, 6.0f, 10.0f, 6.0f);

    public static final void a(final List list, final zy7 zy7Var, final iqb iqbVar, mnc mncVar, tkh tkhVar, long j, float f, ld4 ld4Var, final int i) {
        e18 e18Var;
        final mnc mncVar2;
        final tkh tkhVar2;
        final long j2;
        final float f2;
        tkh tkhVar3;
        mnc mncVar3;
        long j3;
        int i2;
        float f3;
        String url;
        list.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-92921682);
        int i3 = (e18Var2.f(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | 1649664;
        if (e18Var2.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                tkh tkhVar4 = ((jm3) gm3.c(e18Var2).e.E).i;
                long j4 = gm3.a(e18Var2).v;
                tkhVar3 = tkhVar4;
                mncVar3 = a;
                j3 = j4;
                i2 = i4 & (-516097);
                f3 = 20.0f;
            } else {
                e18Var2.T();
                mncVar3 = mncVar;
                tkhVar3 = tkhVar;
                j3 = j;
                i2 = i4 & (-516097);
                f3 = f;
            }
            e18Var2.q();
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i5 = 0; linkedHashMap.size() < 3 && i5 < list.size(); i5++) {
                    KnowledgeSource knowledgeSource = (KnowledgeSource) list.get(i5);
                    SourceImage sourceImage = knowledgeSource.getSourceImage();
                    if (sourceImage instanceof SourceImage.GoogleDoc) {
                        url = SourceImage.GoogleDoc.INSTANCE.toString();
                    } else if (sourceImage instanceof SourceImage.Text) {
                        url = ((SourceImage.Text) sourceImage).getText();
                    } else {
                        if (!(sourceImage instanceof SourceImage.Url)) {
                            wg6.i();
                            return;
                        }
                        url = ((SourceImage.Url) sourceImage).getUrl();
                    }
                    linkedHashMap.putIfAbsent(url, knowledgeSource.getSourceImage());
                }
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                objN = w44.p1(collectionValues);
                e18Var2.k0(objN);
            }
            List list2 = (List) objN;
            boolean zIsEmpty = list2.isEmpty();
            boolean z2 = !zIsEmpty;
            String strE0 = d4c.e0(R.plurals.knowledge_sources, list.size(), e18Var2);
            int i6 = i2;
            amc amcVar = new amc(j3, ((gwa) e18Var2.j(jwa.a)).a.n, gm3.a(e18Var2).N);
            long j5 = j3;
            iqb iqbVarN = fqb.E;
            if (zIsEmpty) {
                iqbVarN = gb9.N(iqbVarN, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
            }
            e18Var = e18Var2;
            cjk.a(strE0, zy7Var, iqbVar.B(iqbVarN), false, false, null, false, fd9.q0(-487041027, new fp7(f3, list2), e18Var2), z2, amcVar, mncVar3, 6.0f, tkhVar3, e18Var, (i6 & 112) | 12582912, 54, 120);
            f2 = f3;
            j2 = j5;
            mncVar2 = mncVar3;
            tkhVar2 = tkhVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            mncVar2 = mncVar;
            tkhVar2 = tkhVar;
            j2 = j;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: yq9
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zq9.a(list, zy7Var, iqbVar, mncVar2, tkhVar2, j2, f2, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }
}
