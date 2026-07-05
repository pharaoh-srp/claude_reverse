package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m5f implements s5f {
    public final /* synthetic */ h80 a;

    public /* synthetic */ m5f(h80 h80Var) {
        this.a = h80Var;
    }

    @Override // defpackage.s5f
    public final Bundle a() {
        cpc[] cpcVarArr;
        h80 h80Var = this.a;
        for (Map.Entry entry : sta.q0((LinkedHashMap) h80Var.H).entrySet()) {
            h80Var.n((String) entry.getKey(), ((amg) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : sta.q0((LinkedHashMap) h80Var.F).entrySet()) {
            h80Var.n((String) entry2.getKey(), ((s5f) entry2.getValue()).a());
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) h80Var.E;
        if (linkedHashMap.isEmpty()) {
            cpcVarArr = new cpc[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new cpc((String) entry3.getKey(), entry3.getValue()));
            }
            cpcVarArr = (cpc[]) arrayList.toArray(new cpc[0]);
        }
        return eve.m((cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length));
    }
}
