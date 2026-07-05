package defpackage;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0f extends h1f implements f1f {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.f1f
    public final List a() {
        return this.h;
    }

    @Override // defpackage.f1f
    public final void f(j1f j1fVar) throws SVGParseException {
        if (j1fVar instanceof a1f) {
            this.h.add(j1fVar);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + j1fVar + " elements.");
    }
}
