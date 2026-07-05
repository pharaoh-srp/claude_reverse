package defpackage;

import com.caverock.androidsvg.SVGParseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u1f extends e1f {
    @Override // defpackage.e1f, defpackage.f1f
    public final void f(j1f j1fVar) throws SVGParseException {
        if (j1fVar instanceof t1f) {
            this.i.add(j1fVar);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + j1fVar + " elements.");
    }
}
