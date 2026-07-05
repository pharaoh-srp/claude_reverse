package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e57 extends f9i {
    public f9i a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xd8 d;
    public final /* synthetic */ dbi e;
    public final /* synthetic */ f57 f;

    public e57(f57 f57Var, boolean z, boolean z2, xd8 xd8Var, dbi dbiVar) {
        this.f = f57Var;
        this.b = z;
        this.c = z2;
        this.d = xd8Var;
        this.e = dbiVar;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) throws IOException {
        if (this.b) {
            jsonReader.skipValue();
            return null;
        }
        f9i f9iVar = this.a;
        if (f9iVar == null) {
            xd8 xd8Var = this.d;
            List list = xd8Var.e;
            g9i g9iVar = this.f;
            if (!list.contains(g9iVar)) {
                g9iVar = xd8Var.d;
            }
            Iterator it = list.iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                dbi dbiVar = this.e;
                if (!zHasNext) {
                    xh6.k("GSON cannot serialize ", dbiVar);
                    return null;
                }
                g9i g9iVar2 = (g9i) it.next();
                if (z) {
                    f9i f9iVarA = g9iVar2.a(xd8Var, dbiVar);
                    if (f9iVarA != null) {
                        this.a = f9iVarA;
                        f9iVar = f9iVarA;
                        break;
                    }
                } else if (g9iVar2 == g9iVar) {
                    z = true;
                }
            }
        }
        return f9iVar.a(jsonReader);
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (this.c) {
            jsonWriter.nullValue();
            return;
        }
        f9i f9iVar = this.a;
        if (f9iVar == null) {
            xd8 xd8Var = this.d;
            List list = xd8Var.e;
            g9i g9iVar = this.f;
            if (!list.contains(g9iVar)) {
                g9iVar = xd8Var.d;
            }
            Iterator it = list.iterator();
            boolean z = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                dbi dbiVar = this.e;
                if (!zHasNext) {
                    xh6.k("GSON cannot serialize ", dbiVar);
                    return;
                }
                g9i g9iVar2 = (g9i) it.next();
                if (z) {
                    f9i f9iVarA = g9iVar2.a(xd8Var, dbiVar);
                    if (f9iVarA != null) {
                        this.a = f9iVarA;
                        f9iVar = f9iVarA;
                        break;
                    }
                } else if (g9iVar2 == g9iVar) {
                    z = true;
                }
            }
        }
        f9iVar.b(jsonWriter, obj);
    }
}
