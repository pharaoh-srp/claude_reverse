package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fyk implements uxk {
    public final lw9 a;
    public final axk b;

    public fyk(Context context, axk axkVar) {
        this.b = axkVar;
        g42 g42Var = g42.e;
        n6i.b(context);
        l6i l6iVarC = n6i.a().c(g42Var);
        if (g42.d.contains(new en6("json"))) {
            new lw9(new cyk(l6iVarC, 0));
        }
        this.a = new lw9(new cyk(l6iVarC, 1));
    }

    @Override // defpackage.uxk
    public final void a(dke dkeVar) {
        zrj zrjVar;
        tac tacVar;
        m6i m6iVar = (m6i) this.a.get();
        lyk lykVar = lyk.Y;
        smk smkVar = (smk) dkeVar.E;
        ((ptk) dkeVar.F).h = false;
        ptk ptkVar = (ptk) dkeVar.F;
        ptkVar.f = Boolean.FALSE;
        smkVar.a = new utk(ptkVar);
        try {
            lyk.v();
            ymk ymkVar = new ymk(smkVar);
            lrb lrbVar = new lrb(26);
            lykVar.i(lrbVar);
            HashMap map = new HashMap((HashMap) lrbVar.F);
            HashMap map2 = new HashMap((HashMap) lrbVar.G);
            urj urjVar = (urj) lrbVar.H;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zrjVar = new zrj(byteArrayOutputStream, map, map2, urjVar);
                tacVar = (tac) map.get(ymk.class);
            } catch (IOException unused) {
            }
            if (tacVar == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(ymk.class)));
            }
            tacVar.a(ymkVar, zrjVar);
            m6iVar.a(new n81(byteArrayOutputStream.toByteArray(), agd.F, null));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
