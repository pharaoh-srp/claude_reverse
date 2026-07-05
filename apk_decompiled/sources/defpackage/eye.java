package defpackage;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class eye implements kje {
    public static final byte[] c;
    public final tk5 a;
    public final h99 b;

    static {
        byte[] bytes = "\n".getBytes(dj2.a);
        bytes.getClass();
        c = bytes;
    }

    public eye(tk5 tk5Var, h99 h99Var) {
        h99Var.getClass();
        this.a = tk5Var;
        this.b = h99Var;
    }

    @Override // defpackage.kje
    public final lie a(lj5 lj5Var, fje fjeVar, List list) {
        String strV;
        lj5Var.getClass();
        String str = lj5Var.h;
        Integer num = fjeVar.b;
        list.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<x1e> list2 = list;
        for (x1e x1eVar : list2) {
            wxe wxeVar = (wxe) ((ah5) this.a.F).r(x1eVar.b);
            if (wxeVar != null) {
                linkedHashMap2.put(x1eVar, wxeVar);
                String str2 = wxeVar.a;
                long j = wxeVar.b;
                Long l = (Long) linkedHashMap.get(str2);
                if (l == null) {
                    linkedHashMap.put(str2, Long.valueOf(j));
                } else {
                    linkedHashMap.put(str2, Long.valueOf(Math.max(j, l.longValue())));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            x1e x1eVar2 = (x1e) obj;
            if (linkedHashMap2.containsKey(x1eVar2)) {
                wxe wxeVar2 = (wxe) sta.f0(x1eVar2, linkedHashMap2);
                if (wxeVar2.c.equals(Boolean.TRUE) || wxeVar2.b == ((Number) sta.f0(wxeVar2.a, linkedHashMap)).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x1e) it.next()).a);
        }
        byte[] bArrQ = nai.Q(arrayList2, c, this.b);
        g99 g99Var = g99.F;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(bArrQ);
            bArrDigest.getClass();
            strV = dch.V(bArrDigest);
        } catch (IllegalArgumentException e) {
            dch.H(this.b, 5, g99Var, uxe.Q, e, false, 48);
            strV = null;
        } catch (NullPointerException e2) {
            dch.H(this.b, 5, g99Var, uxe.S, e2, false, 48);
            strV = null;
        } catch (DigestException e3) {
            dch.H(this.b, 5, g99Var, uxe.P, e3, false, 48);
            strV = null;
        } catch (NoSuchAlgorithmException e4) {
            dch.H(this.b, 5, g99Var, uxe.R, e4, false, 48);
            strV = null;
        }
        lqa lqaVar = new lqa();
        lqaVar.put("ddsource", str);
        StringBuilder sb = new StringBuilder();
        if (num != null) {
            sb.append("retry_count:" + fjeVar.a);
            sb.append(",");
            sb.append("last_failure_status:" + num);
        }
        String string2 = sb.toString();
        if (string2.length() > 0) {
            lqaVar.put("ddtags", string2);
        }
        lqa lqaVarC = lqaVar.c();
        String strO = kgh.o(lj5Var.a.F, "/api/v2/rum");
        ArrayList arrayList3 = new ArrayList(lqaVarC.M);
        Iterator it2 = ((mqa) lqaVarC.entrySet()).iterator();
        while (((jqa) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((jqa) it2).next();
            arrayList3.add(entry.getKey() + "=" + entry.getValue());
        }
        String strConcat = strO.concat(w44.S0(arrayList3, "&", "?", null, null, 60));
        LinkedHashMap linkedHashMapJ0 = sta.j0(new cpc("DD-API-KEY", lj5Var.b), new cpc("DD-EVP-ORIGIN", str), new cpc("DD-EVP-ORIGIN-VERSION", lj5Var.i), new cpc("DD-REQUEST-ID", string));
        if (strV != null) {
            linkedHashMapJ0.put("DD-IDEMPOTENCY-KEY", strV);
        }
        return new lie(string, "RUM Request", strConcat, linkedHashMapJ0, bArrQ, "text/plain;charset=UTF-8");
    }
}
