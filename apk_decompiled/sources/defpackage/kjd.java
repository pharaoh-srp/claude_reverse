package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class kjd implements kje {
    public static final p8b a;
    public static final p8b b;

    static {
        p8b p8bVarD;
        ide ideVar = p8b.e;
        p8b p8bVarD2 = null;
        try {
            p8bVarD = nai.D("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            p8bVarD = null;
        }
        a = p8bVarD;
        ide ideVar2 = p8b.e;
        try {
            p8bVarD2 = nai.D("application/json");
        } catch (IllegalArgumentException unused2) {
        }
        b = p8bVarD2;
    }

    @Override // defpackage.kje
    public final lie a(lj5 lj5Var, fje fjeVar, List list) throws EOFException {
        lj5Var.getClass();
        list.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strI = vb7.i();
        ByteString byteString = ByteString.H;
        ByteString byteStringB = ByteString.Companion.b(strI);
        p8b p8bVar = hub.e;
        ArrayList arrayList = new ArrayList();
        p8b p8bVar2 = hub.f;
        p8bVar2.getClass();
        if (!p8bVar2.b.equals("multipart")) {
            mr9.t("multipart != ", p8bVar2);
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x1e x1eVar = (x1e) it.next();
            sie sieVar = tie.Companion;
            arrayList.add(htk.g("perfetto.proto", "perfetto.proto", sie.c(sieVar, x1eVar.b, a, 0, 6)));
            arrayList.add(htk.g("event", "event.json", sie.c(sieVar, x1eVar.a, b, 0, 6)));
        }
        if (arrayList.isEmpty()) {
            sz6.j("Multipart body must have at least one part.");
            return null;
        }
        hub hubVar = new hub(byteStringB, p8bVar2, blj.k(arrayList));
        String strO = kgh.o(lj5Var.a.F, "/api/v2/profile");
        Map mapH0 = sta.h0(new cpc("DD-API-KEY", lj5Var.b), new cpc("DD-EVP-ORIGIN", lj5Var.h), new cpc("DD-EVP-ORIGIN-VERSION", lj5Var.i), new cpc("DD-REQUEST-ID", string));
        Buffer buffer = new Buffer();
        hubVar.a(buffer, false);
        return new lie(string, "Profiling Request", strO, mapH0, buffer.K(buffer.F), String.valueOf(hubVar.c));
    }
}
