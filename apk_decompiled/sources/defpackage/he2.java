package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class he2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cz5 F;

    public /* synthetic */ he2(int i, cz5 cz5Var) {
        this.E = i;
        this.F = cz5Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        cz5 cz5Var = this.F;
        switch (i) {
            case 0:
                return Float.valueOf(cz5Var.W0(eve.L(((Float) obj).floatValue(), 4294967296L)));
            default:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                documentBuilderFactoryNewInstance.setNamespaceAware(true);
                Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(bArr))).getDocumentElement();
                documentElement.getClass();
                zj6 zj6Var = new zj6(documentElement);
                cz5Var.getClass();
                d80 d80Var = new d80(1);
                float fN = hvj.n(zmk.h(zj6Var, "width"), cz5Var);
                float fN2 = hvj.n(zmk.h(zj6Var, "height"), cz5Var);
                String strH = zmk.h(zj6Var, "viewportWidth");
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                float f2 = strH != null ? Float.parseFloat(strH) : 0.0f;
                String strH2 = zmk.h(zj6Var, "viewportHeight");
                if (strH2 != null) {
                    f = Float.parseFloat(strH2);
                }
                oy8 oy8Var = new oy8(null, fN, fN2, f2, f, 0L, 0, x44.r(zmk.h(zj6Var, "autoMirrored"), "true"), 97);
                zmk.o(zj6Var, oy8Var, d80Var);
                return new cw8(oy8Var.e());
        }
    }
}
