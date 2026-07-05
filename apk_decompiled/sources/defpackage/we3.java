package defpackage;

import com.anthropic.router.panes.Panes;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ r7i F;

    public /* synthetic */ we3(r7i r7iVar, int i) {
        this.E = i;
        this.F = r7iVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        r7i r7iVar = this.F;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                if (r7iVar == null) {
                    return null;
                }
                return qwk.c(panes, Panes.Companion.serializer((KSerializer) r7iVar.E, (KSerializer) r7iVar.F, (KSerializer) r7iVar.G));
            default:
                SerializableContainer serializableContainer = (SerializableContainer) obj;
                serializableContainer.getClass();
                if (r7iVar == null) {
                    return null;
                }
                return (Panes) serializableContainer.consume(Panes.Companion.serializer((KSerializer) r7iVar.E, (KSerializer) r7iVar.F, (KSerializer) r7iVar.G));
        }
    }
}
