package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final class l8j implements h8j, BiConsumer {
    public Long a;
    public Long b;
    public ArrayList c;
    public ArrayList d;

    @Override // defpackage.h8j
    public final List a() {
        return this.c;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        ArrayList arrayList = this.d;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            if (obj2 != null) {
                this.a = (Long) obj2;
                return;
            }
            return;
        }
        if (iIntValue == 1) {
            if (obj2 != null) {
                this.b = (Long) obj2;
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            this.c.add(new bm4());
            return;
        }
        if (iIntValue != 3) {
            if (num.intValue() >= 0) {
                return;
            }
            poc.t("The current AndroidX version doesn't support this callback value: ", num);
        } else {
            if (!(obj2 instanceof List)) {
                arrayList.add(new bm4());
                return;
            }
            List list = (List) obj2;
            if (list.isEmpty()) {
                return;
            }
            arrayList.add(new bm4());
        }
    }

    @Override // defpackage.h8j
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        return this.b;
    }

    @Override // defpackage.h8j
    public final Long getTotalTimeInUiThreadMillis() {
        return this.a;
    }
}
