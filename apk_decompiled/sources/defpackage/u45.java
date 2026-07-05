package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u45 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ u45(List list, nwb nwbVar, int i) {
        this.E = i;
        this.F = list;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        nwb nwbVar = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                if (((String) nwbVar.getValue()).length() == 0) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    String strValueOf = String.valueOf(((t45) obj).E);
                    if (isg.q0(strValueOf, (String) nwbVar.getValue(), false) || isg.q0("+".concat(strValueOf), (String) nwbVar.getValue(), false)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    TaskSessionEvent taskSessionEvent = ((u7h) obj2).c;
                    JsonObject jsonObject = f.a;
                    taskSessionEvent.getClass();
                    if (f.c(taskSessionEvent) == null) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }
}
