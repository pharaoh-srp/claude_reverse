package defpackage;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ KSerializer F;

    public /* synthetic */ cf3(KSerializer kSerializer, int i) {
        this.E = i;
        this.F = kSerializer;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        KSerializer kSerializer = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (kSerializer != null) {
                    return qwk.c(list, new uo0(kSerializer, 0));
                }
                return null;
            default:
                SerializableContainer serializableContainer = (SerializableContainer) obj;
                serializableContainer.getClass();
                if (kSerializer != null) {
                    return (List) qwk.e(serializableContainer, new uo0(kSerializer, 0));
                }
                return null;
        }
    }
}
