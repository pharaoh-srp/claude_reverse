package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k6a implements Iterator, mm9 {
    public String E;
    public boolean F;
    public final /* synthetic */ c54 G;

    public k6a(c54 c54Var) {
        this.G = c54Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.E == null && !this.F) {
            String line = ((BufferedReader) this.G.b).readLine();
            this.E = line;
            if (line == null) {
                this.F = true;
            }
        }
        return this.E != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        String str = this.E;
        this.E = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
