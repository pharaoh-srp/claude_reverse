package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 implements KSerializer {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Collection d;
    public final SerialDescriptor e;

    public rp4(pl9 pl9Var, KSerializer kSerializer, KSerializer[] kSerializerArr) {
        this.a = 0;
        pl9Var.getClass();
        this.b = pl9Var;
        this.c = kSerializer;
        List listAsList = Arrays.asList(kSerializerArr);
        listAsList.getClass();
        this.d = listAsList;
        this.e = new vo4(j8.n("kotlinx.serialization.ContextualSerializer", lnf.l, new SerialDescriptor[0], new a2(19, this)), pl9Var);
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String languageTag;
        int i = this.a;
        Collection collection = this.d;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                decoder.getClass();
                pl9 pl9Var = (pl9) obj;
                KSerializer kSerializerB = decoder.a().b(pl9Var, (List) collection);
                if (kSerializerB == null && (kSerializerB = (KSerializer) obj2) == null) {
                    throw new SerializationException(yfd.M(pl9Var));
                }
                return decoder.g(kSerializerB);
            default:
                kea keaVar = (kea) obj2;
                decoder.getClass();
                String strS = decoder.s();
                lea leaVar = (lea) obj;
                Map map = (Map) leaVar.b.get(leaVar.a());
                if (map == null) {
                    map = nm6.E;
                }
                String str = (String) map.get(strS);
                if (str == null && !map.isEmpty()) {
                    Locale locale = (Locale) w44.N0(keaVar.a);
                    if (!x44.r(locale != null ? locale.getLanguage() : null, Locale.ENGLISH.getLanguage()) && !bsg.I0(strS)) {
                        Locale locale2 = (Locale) w44.N0(keaVar.a);
                        if (locale2 == null || (languageTag = locale2.toLanguageTag()) == null) {
                            languageTag = "";
                        }
                        if (((ConcurrentHashMap.KeySetView) collection).add(languageTag + "|" + strS)) {
                            List list = xah.a;
                            xah.d("Missing translation for server localized string", "i18n", sta.h0(new cpc("english_key", strS), new cpc("locale", languageTag)));
                            SilentException.a(new SilentException("Missing translation for server localized string: ".concat(strS)), null, false, 3);
                        }
                    }
                }
                return new _ServerLocalizedString(strS, str);
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return (vo4) this.e;
            default:
                return (rfd) this.e;
        }
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                encoder.getClass();
                obj.getClass();
                fof fofVarA = encoder.a();
                pl9 pl9Var = (pl9) this.b;
                KSerializer kSerializerB = fofVarA.b(pl9Var, (List) this.d);
                if (kSerializerB == null && (kSerializerB = (KSerializer) this.c) == null) {
                    throw new SerializationException(yfd.M(pl9Var));
                }
                encoder.h(obj, kSerializerB);
                return;
            default:
                _ServerLocalizedString _serverlocalizedstring = (_ServerLocalizedString) obj;
                encoder.getClass();
                _serverlocalizedstring.getClass();
                encoder.F(_serverlocalizedstring.getEnglish());
                return;
        }
    }

    public rp4(lea leaVar, kea keaVar) {
        this.a = 1;
        this.b = leaVar;
        this.c = keaVar;
        this.d = ConcurrentHashMap.newKeySet();
        this.e = j8.h("LocalizedString", kfd.t);
    }
}
