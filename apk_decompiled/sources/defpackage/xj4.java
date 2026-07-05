package defpackage;

import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.api.conway.WebhookRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xj4 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ xj4(String str, boolean z, int i) {
        this.E = i;
        this.F = str;
        this.G = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.G;
        String str = this.F;
        switch (i) {
            case 0:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                if (!z) {
                    str = "";
                }
                ckf.v(ekfVar, str);
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                List<WebhookRecord> list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                for (WebhookRecord webhookRecordCopy$default : list2) {
                    if (x44.r(webhookRecordCopy$default.getToken(), str)) {
                        webhookRecordCopy$default = WebhookRecord.copy$default(webhookRecordCopy$default, null, null, null, null, null, this.G, null, null, 223, null);
                    }
                    arrayList.add(webhookRecordCopy$default);
                }
                break;
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                List<HeartbeatRecord> list4 = list3;
                ArrayList arrayList2 = new ArrayList(x44.y(list4, 10));
                for (HeartbeatRecord heartbeatRecordCopy$default : list4) {
                    if (x44.r(heartbeatRecordCopy$default.getName(), str)) {
                        heartbeatRecordCopy$default = HeartbeatRecord.copy$default(heartbeatRecordCopy$default, null, null, null, Boolean.valueOf(z), null, 23, null);
                    }
                    arrayList2.add(heartbeatRecordCopy$default);
                }
                break;
            case 3:
                List<HeartbeatRecord> list5 = (List) obj;
                ArrayList arrayList3 = new ArrayList(x44.y(list5, 10));
                for (HeartbeatRecord heartbeatRecordCopy$default2 : list5) {
                    if (x44.r(heartbeatRecordCopy$default2.getName(), str)) {
                        heartbeatRecordCopy$default2 = HeartbeatRecord.copy$default(heartbeatRecordCopy$default2, null, null, null, Boolean.valueOf(!z), null, 23, null);
                    }
                    arrayList3.add(heartbeatRecordCopy$default2);
                }
                break;
            case 4:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.v(ekfVar2, str);
                if (!z) {
                    ckf.b(ekfVar2);
                }
                break;
            case 5:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.v(ekfVar3, str);
                if (!z) {
                    ckf.b(ekfVar3);
                }
                break;
            default:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                if (z) {
                    ckf.v(ekfVar4, str);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xj4(boolean z, String str, int i) {
        this.E = i;
        this.G = z;
        this.F = str;
    }
}
