package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final class k8j implements BiConsumer {
    public Integer a;
    public String b;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.a = (Integer) obj2;
        } else if (iIntValue == 1) {
            this.b = (String) obj2;
        } else {
            if (num.intValue() >= 0) {
                return;
            }
            poc.t("The current AndroidX version doesn't support this callback value: ", num);
        }
    }
}
