package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.anthropic.claude.R;
import com.anthropic.claude.models.organization.configtypes.DeedeeConfig;
import com.anthropic.claude.models.organization.configtypes.SpeechInputConfig;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ysg {
    public final Context a;
    public final fk0 b;
    public final rc8 c;
    public final wz5 d;
    public final kw9 e;
    public final wz5 f;
    public final wz5 g;
    public final wz5 h;
    public final wz5 i;
    public final wz5 j;

    public ysg(Context context, fk0 fk0Var, rc8 rc8Var, y31 y31Var) {
        this.a = context;
        this.b = fk0Var;
        this.c = rc8Var;
        final int i = 0;
        this.d = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i2 = i;
                ysg ysgVar = this.F;
                switch (i2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i2 = 1;
        this.e = yb5.w(w1a.G, new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i2;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i3 = 2;
        this.f = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i3;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i4 = 3;
        this.g = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i4;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i5 = 4;
        this.h = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i5;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i6 = 5;
        this.i = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i6;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
        final int i7 = 6;
        this.j = mpk.w(new zy7(this) { // from class: xsg
            public final /* synthetic */ ysg F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Integer maximum_request_duration_seconds;
                List<SttSupportedLanguage> supported_languages;
                String default_language_code;
                int i22 = i7;
                ysg ysgVar = this.F;
                switch (i22) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 29) {
                            DeedeeConfig deedeeConfig = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                            if ((deedeeConfig != null ? deedeeConfig.getSpeech_input() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        String string = ysgVar.a.getString(R.string.english_stt_fallback);
                        string.getClass();
                        return new SttSupportedLanguage("en", string, (List) null, 4, (mq5) null);
                    case 2:
                        DeedeeConfig deedeeConfig2 = (DeedeeConfig) ysgVar.c.g("mobile_deedee_config", DeedeeConfig.Companion.serializer()).getValue();
                        if (deedeeConfig2 != null) {
                            return deedeeConfig2.getSpeech_input();
                        }
                        return null;
                    case 3:
                        SpeechInputConfig speechInputConfig = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig == null || (maximum_request_duration_seconds = speechInputConfig.getMaximum_request_duration_seconds()) == null) {
                            return null;
                        }
                        return Long.valueOf(maximum_request_duration_seconds.intValue());
                    case 4:
                        SpeechInputConfig speechInputConfig2 = (SpeechInputConfig) ysgVar.f.getValue();
                        if (speechInputConfig2 == null || (supported_languages = speechInputConfig2.getSupported_languages()) == null) {
                            return lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : supported_languages) {
                            SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj;
                            if (sttSupportedLanguage.getCode().length() > 0 && sttSupportedLanguage.getDisplay_name().length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 5:
                        SpeechInputConfig speechInputConfig3 = (SpeechInputConfig) ysgVar.f.getValue();
                        return (speechInputConfig3 == null || (default_language_code = speechInputConfig3.getDefault_language_code()) == null) ? ((SttSupportedLanguage) ysgVar.e.getValue()).getCode() : default_language_code;
                    default:
                        SpeechInputConfig speechInputConfig4 = (SpeechInputConfig) ysgVar.f.getValue();
                        return Boolean.valueOf(speechInputConfig4 != null ? x44.r(speechInputConfig4.is_voice_multilingual_enabled(), Boolean.TRUE) : false);
                }
            }
        });
    }

    public static String a() {
        String languageTag;
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        if (locale == null || (languageTag = locale.toLanguageTag()) == null || languageTag.length() <= 0 || languageTag.equals("und")) {
            return null;
        }
        return languageTag;
    }

    public final SttSupportedLanguage b(String str) {
        Object obj;
        Object next;
        Object next2;
        str.getClass();
        String strH1 = bsg.h1(str, "-");
        wz5 wz5Var = this.h;
        Iterator it = ((Iterable) wz5Var.getValue()).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((SttSupportedLanguage) next).getCode(), str)) {
                break;
            }
        }
        SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) next;
        if (sttSupportedLanguage != null) {
            return sttSupportedLanguage;
        }
        Iterator it2 = ((Iterable) wz5Var.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (x44.r(((SttSupportedLanguage) next2).getCode(), strH1)) {
                break;
            }
        }
        SttSupportedLanguage sttSupportedLanguage2 = (SttSupportedLanguage) next2;
        if (sttSupportedLanguage2 != null) {
            return sttSupportedLanguage2;
        }
        Iterator it3 = ((Iterable) wz5Var.getValue()).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (bsg.h1(((SttSupportedLanguage) next3).getCode(), "-").equals(strH1)) {
                obj = next3;
                break;
            }
        }
        return (SttSupportedLanguage) obj;
    }

    public final SttSupportedLanguage c(String str) {
        SttSupportedLanguage sttSupportedLanguageB;
        Locale locale;
        if (str == null && ((locale = this.a.getResources().getConfiguration().getLocales().get(0)) == null || (str = locale.toLanguageTag()) == null || str.length() <= 0 || str.equals("und"))) {
            str = null;
        }
        if (str != null && (sttSupportedLanguageB = b(str)) != null) {
            return sttSupportedLanguageB;
        }
        SttSupportedLanguage sttSupportedLanguageB2 = b((String) this.i.getValue());
        return sttSupportedLanguageB2 == null ? (SttSupportedLanguage) this.e.getValue() : sttSupportedLanguageB2;
    }
}
