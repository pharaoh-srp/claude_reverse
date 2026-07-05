package defpackage;

import com.arkivanov.decompose.router.children.ChildrenNavigator$SavedChildState;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf3 implements w28 {
    public static final jf3 a;
    private static final SerialDescriptor descriptor;

    static {
        jf3 jf3Var = new jf3();
        a = jf3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.children.ChildrenNavigator.SavedChildState", jf3Var, 2);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("savedState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(rnf.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        SerializableContainer serializableContainer = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                serializableContainer = (SerializableContainer) ud4VarC.m(serialDescriptor, 1, rnf.a, serializableContainer);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChildrenNavigator$SavedChildState(i, strV, serializableContainer, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChildrenNavigator$SavedChildState childrenNavigator$SavedChildState = (ChildrenNavigator$SavedChildState) obj;
        encoder.getClass();
        childrenNavigator$SavedChildState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChildrenNavigator$SavedChildState.write$Self$decompose_release(childrenNavigator$SavedChildState, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }

    @Override // defpackage.w28
    public final KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
