package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.conway.HeartbeatRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class tq implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;

    public /* synthetic */ tq(List list, int i) {
        this.E = i;
        this.F = list;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Object next;
        HeartbeatRecord heartbeatRecordCopy$default;
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                break;
            case 1:
                list.get(((Number) obj).intValue());
                break;
            case 2:
                list.get(((Number) obj).intValue());
                break;
            case 3:
                whd whdVar = (whd) list.get(((Number) obj).intValue());
                if (!(whdVar instanceof vhd)) {
                    if (!(whdVar instanceof uhd)) {
                        wg6.i();
                    }
                }
                break;
            case 4:
                list.get(((Number) obj).intValue());
                break;
            case 5:
                list.get(((Number) obj).intValue());
                break;
            case 6:
                list.get(((Number) obj).intValue());
                break;
            case 7:
                list.get(((Number) obj).intValue());
                break;
            case 8:
                list.get(((Number) obj).intValue());
                break;
            case 9:
                list.get(((Number) obj).intValue());
                break;
            case 10:
                list.get(((Number) obj).intValue());
                break;
            case 11:
                list.get(((Number) obj).intValue());
                break;
            case 12:
                list.get(((Number) obj).intValue());
                break;
            case 13:
                list.get(((Number) obj).intValue());
                break;
            case 14:
                list.get(((Number) obj).intValue());
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                List list2 = (List) obj;
                list2.getClass();
                List<HeartbeatRecord> list3 = list2;
                ArrayList arrayList = new ArrayList(x44.y(list3, 10));
                for (HeartbeatRecord heartbeatRecord : list3) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (x44.r(((HeartbeatRecord) next).getName(), heartbeatRecord.getName())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    HeartbeatRecord heartbeatRecord2 = (HeartbeatRecord) next;
                    if (heartbeatRecord2 != null && (heartbeatRecordCopy$default = HeartbeatRecord.copy$default(heartbeatRecord, null, null, null, null, heartbeatRecord2.getNext_fire_at(), 15, null)) != null) {
                        heartbeatRecord = heartbeatRecordCopy$default;
                    }
                    arrayList.add(heartbeatRecord);
                }
                break;
            case 16:
                list.get(((Number) obj).intValue());
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                list.get(((Number) obj).intValue());
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                list.get(((Number) obj).intValue());
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                list.get(((Number) obj).intValue());
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                list.get(((Number) obj).intValue());
                break;
            case 21:
                list.get(((Number) obj).intValue());
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                list.get(((Number) obj).intValue());
                break;
            case 24:
                list.get(((Number) obj).intValue());
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                list.get(((Number) obj).intValue());
                break;
            case 26:
                list.get(((Number) obj).intValue());
                break;
            case 27:
                list.get(((Number) obj).intValue());
                break;
            case 28:
                list.get(((Number) obj).intValue());
                break;
            default:
                list.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
