package defpackage;

import com.mikepenz.aboutlibraries.entity.Library;
import com.mikepenz.aboutlibraries.entity.Organization;
import com.mikepenz.aboutlibraries.entity.Scm;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l3a implements w28 {
    public static final l3a a;
    private static final SerialDescriptor descriptor;

    static {
        l3a l3aVar = new l3a();
        a = l3aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.mikepenz.aboutlibraries.entity.Library", l3aVar, 11);
        pluginGeneratedSerialDescriptor.j("uniqueId", false);
        pluginGeneratedSerialDescriptor.j("artifactVersion", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("website", false);
        pluginGeneratedSerialDescriptor.j("developers", false);
        pluginGeneratedSerialDescriptor.j("organization", false);
        pluginGeneratedSerialDescriptor.j("scm", false);
        pluginGeneratedSerialDescriptor.j("licenses", true);
        pluginGeneratedSerialDescriptor.j("funding", true);
        pluginGeneratedSerialDescriptor.j("tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Library.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[5].getValue(), d4c.S(zjc.a), d4c.S(k7f.a), kw9VarArr[8].getValue(), kw9VarArr[9].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        kw9[] kw9VarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr3 = Library.$childSerializers;
        String str = null;
        rz8 rz8Var = null;
        rz8 rz8Var2 = null;
        boolean z2 = true;
        Scm scm = null;
        int i = 0;
        String strV = null;
        String str2 = null;
        String strV2 = null;
        String str3 = null;
        String str4 = null;
        mz8 mz8Var = null;
        Organization organization = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr2 = kw9VarArr3;
                    z2 = false;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 2:
                    kw9VarArr2 = kw9VarArr3;
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    mz8Var = (mz8) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), mz8Var);
                    i |= 32;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    organization = (Organization) ud4VarC.m(serialDescriptor, 6, zjc.a, organization);
                    i |= 64;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    scm = (Scm) ud4VarC.m(serialDescriptor, 7, k7f.a, scm);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    rz8Var2 = (rz8) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), rz8Var2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    rz8Var = (rz8) ud4VarC.l(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), rz8Var);
                    i |= 512;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Library(i, strV, str2, strV2, str3, str4, mz8Var, organization, scm, rz8Var2, rz8Var, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Library library = (Library) obj;
        encoder.getClass();
        library.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Library.write$Self$aboutlibraries_core_release(library, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
