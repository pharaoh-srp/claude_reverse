package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ws5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;

    public /* synthetic */ ws5(List list, int i) {
        this.E = i;
        this.F = list;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
                return Integer.valueOf(list.size());
            case 2:
                return ((eo9) list.get(0)).h();
            case 3:
                return ((eo9) list.get(0)).h();
            case 4:
                return list;
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    TaskSessionEvent taskSessionEvent = ((u7h) obj2).c;
                    JsonObject jsonObject = f.a;
                    taskSessionEvent.getClass();
                    if (f.c(taskSessionEvent) != null) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                return Integer.valueOf(list.size());
        }
    }
}
