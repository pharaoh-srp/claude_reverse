package com.agog.mathdisplay.render;

import com.agog.mathdisplay.parse.MTFontStyle;
import com.agog.mathdisplay.parse.MathDisplayException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010'\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010)\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010-\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u00101\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u00104\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u00108\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u0016\u00109\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010:\u001a\u00020;\u001a\u0016\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"numberOfGlyphs", "", "s", "", "kMTUnicodeGreekLowerStart", "", "kMTUnicodeGreekLowerEnd", "kMTUnicodeGreekCapitalStart", "kMTUnicodeGreekCapitalEnd", "isLowerEn", "", "ch", "isUpperEn", "isNumber", "isLowerGreek", "isCapitalGreek", "greekSymbolOrder", "isGREEKSYMBOL", "kMTUnicodePlanksConstant", "kMTUnicodeMathCapitalItalicStart", "kMTUnicodeMathLowerItalicStart", "kMTUnicodeGreekCapitalItalicStart", "kMTUnicodeGreekLowerItalicStart", "kMTUnicodeGreekSymbolItalicStart", "getItalicized", "Lcom/agog/mathdisplay/render/MTCodepointChar;", "kMTUnicodeMathCapitalBoldStart", "kMTUnicodeMathLowerBoldStart", "kMTUnicodeGreekCapitalBoldStart", "kMTUnicodeGreekLowerBoldStart", "kMTUnicodeGreekSymbolBoldStart", "kMTUnicodeNumberBoldStart", "getBold", "kMTUnicodeMathCapitalBoldItalicStart", "kMTUnicodeMathLowerBoldItalicStart", "kMTUnicodeGreekCapitalBoldItalicStart", "kMTUnicodeGreekLowerBoldItalicStart", "kMTUnicodeGreekSymbolBoldItalicStart", "getBoldItalic", "getDefaultStyle", "kMTUnicodeMathCapitalScriptStart", "getCaligraphic", "kMTUnicodeMathCapitalTTStart", "kMTUnicodeMathLowerTTStart", "kMTUnicodeNumberTTStart", "getTypewriter", "kMTUnicodeMathCapitalSansSerifStart", "kMTUnicodeMathLowerSansSerifStart", "kMTUnicodeNumberSansSerifStart", "getSansSerif", "kMTUnicodeMathCapitalFrakturStart", "kMTUnicodeMathLowerFrakturStart", "getFraktur", "kMTUnicodeMathCapitalBlackboardStart", "kMTUnicodeMathLowerBlackboardStart", "kMTUnicodeNumberBlackboardStart", "getBlackboard", "styleCharacter", "fontStyle", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "changeFont", "str", "mathdisplaylib"}, k = 2, mv = {2, 2, 0}, xi = mdj.f)
public final class MTCharsetKt {
    public static final int kMTUnicodeGreekCapitalBoldItalicStart = 120604;
    public static final int kMTUnicodeGreekCapitalBoldStart = 120488;
    public static final char kMTUnicodeGreekCapitalEnd = 937;
    public static final int kMTUnicodeGreekCapitalItalicStart = 120546;
    public static final char kMTUnicodeGreekCapitalStart = 913;
    public static final int kMTUnicodeGreekLowerBoldItalicStart = 120630;
    public static final int kMTUnicodeGreekLowerBoldStart = 120514;
    public static final char kMTUnicodeGreekLowerEnd = 969;
    public static final int kMTUnicodeGreekLowerItalicStart = 120572;
    public static final char kMTUnicodeGreekLowerStart = 945;
    public static final int kMTUnicodeGreekSymbolBoldItalicStart = 120656;
    public static final int kMTUnicodeGreekSymbolBoldStart = 120540;
    public static final int kMTUnicodeGreekSymbolItalicStart = 120598;
    public static final int kMTUnicodeMathCapitalBlackboardStart = 120120;
    public static final int kMTUnicodeMathCapitalBoldItalicStart = 119912;
    public static final int kMTUnicodeMathCapitalBoldStart = 119808;
    public static final int kMTUnicodeMathCapitalFrakturStart = 120068;
    public static final int kMTUnicodeMathCapitalItalicStart = 119860;
    public static final int kMTUnicodeMathCapitalSansSerifStart = 120224;
    public static final int kMTUnicodeMathCapitalScriptStart = 119964;
    public static final int kMTUnicodeMathCapitalTTStart = 120432;
    public static final int kMTUnicodeMathLowerBlackboardStart = 120146;
    public static final int kMTUnicodeMathLowerBoldItalicStart = 119938;
    public static final int kMTUnicodeMathLowerBoldStart = 119834;
    public static final int kMTUnicodeMathLowerFrakturStart = 120094;
    public static final int kMTUnicodeMathLowerItalicStart = 119886;
    public static final int kMTUnicodeMathLowerSansSerifStart = 120250;
    public static final int kMTUnicodeMathLowerTTStart = 120458;
    public static final int kMTUnicodeNumberBlackboardStart = 120792;
    public static final int kMTUnicodeNumberBoldStart = 120782;
    public static final int kMTUnicodeNumberSansSerifStart = 120802;
    public static final int kMTUnicodeNumberTTStart = 120822;
    public static final int kMTUnicodePlanksConstant = 8462;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTFontStyle.values().length];
            try {
                iArr[MTFontStyle.KMTFontStyleDefault.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleRoman.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBold.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleItalic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBoldItalic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleCaligraphic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleTypewriter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleSansSerif.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleFraktur.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MTFontStyle.KMTFontStyleBlackboard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String changeFont(String str, MTFontStyle mTFontStyle) {
        str.getClass();
        mTFontStyle.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        for (char c : charArray) {
            stringBuffer.append(styleCharacter(c, mTFontStyle).toUnicodeString());
        }
        String string = stringBuffer.toString();
        string.getClass();
        return string;
    }

    public static final MTCodepointChar getBlackboard(char c) {
        if (c == 'C') {
            return new MTCodepointChar(8450);
        }
        if (c == 'H') {
            return new MTCodepointChar(8461);
        }
        if (c == 'N') {
            return new MTCodepointChar(8469);
        }
        if (c == 'Z') {
            return new MTCodepointChar(8484);
        }
        switch (c) {
            case 'P':
                return new MTCodepointChar(8473);
            case 'Q':
                return new MTCodepointChar(8474);
            case 'R':
                return new MTCodepointChar(8477);
            default:
                return isUpperEn(c) ? new MTCodepointChar(c - 11017) : isLowerEn(c) ? new MTCodepointChar(c - 11023) : isNumber(c) ? new MTCodepointChar(c - 10328) : getDefaultStyle(c);
        }
    }

    public static final MTCodepointChar getBold(char c) {
        return isUpperEn(c) ? new MTCodepointChar(c - 11329) : isLowerEn(c) ? new MTCodepointChar(c - 11335) : isCapitalGreek(c) ? new MTCodepointChar(c - 11497) : isLowerGreek(c) ? new MTCodepointChar(c - 11503) : isGREEKSYMBOL(c) ? new MTCodepointChar(greekSymbolOrder(c) + kMTUnicodeGreekSymbolBoldStart) : isNumber(c) ? new MTCodepointChar(c - 10338) : new MTCodepointChar(c);
    }

    public static final MTCodepointChar getBoldItalic(char c) {
        return isUpperEn(c) ? new MTCodepointChar(c - 11225) : isLowerEn(c) ? new MTCodepointChar(c - 11231) : isCapitalGreek(c) ? new MTCodepointChar(c - 11381) : isLowerGreek(c) ? new MTCodepointChar(c - 11387) : isGREEKSYMBOL(c) ? new MTCodepointChar(greekSymbolOrder(c) + kMTUnicodeGreekSymbolBoldItalicStart) : isNumber(c) ? getBold(c) : new MTCodepointChar(c);
    }

    public static final MTCodepointChar getCaligraphic(char c) {
        return c != 'B' ? c != 'R' ? c != 'e' ? c != 'g' ? c != 'o' ? c != 'E' ? c != 'F' ? c != 'H' ? c != 'I' ? c != 'L' ? c != 'M' ? isUpperEn(c) ? new MTCodepointChar(c - 11173) : isLowerEn(c) ? getDefaultStyle(c) : getDefaultStyle(c) : new MTCodepointChar(8499) : new MTCodepointChar(8466) : new MTCodepointChar(8464) : new MTCodepointChar(8459) : new MTCodepointChar(8497) : new MTCodepointChar(8496) : new MTCodepointChar(8500) : new MTCodepointChar(8458) : new MTCodepointChar(8495) : new MTCodepointChar(8475) : new MTCodepointChar(8492);
    }

    public static final MTCodepointChar getDefaultStyle(char c) throws MathDisplayException {
        if (isLowerEn(c) || isUpperEn(c) || isLowerGreek(c) || isGREEKSYMBOL(c)) {
            return getItalicized(c);
        }
        if (isNumber(c) || isCapitalGreek(c)) {
            return new MTCodepointChar(c);
        }
        if (c == '.') {
            return new MTCodepointChar(c);
        }
        throw new MathDisplayException("Unknown character " + c + " for default style.");
    }

    public static final MTCodepointChar getFraktur(char c) {
        return c != 'C' ? c != 'R' ? c != 'Z' ? c != 'H' ? c != 'I' ? isUpperEn(c) ? new MTCodepointChar(c - 11069) : isLowerEn(c) ? new MTCodepointChar(c - 11075) : getDefaultStyle(c) : new MTCodepointChar(8465) : new MTCodepointChar(8460) : new MTCodepointChar(8488) : new MTCodepointChar(8476) : new MTCodepointChar(8493);
    }

    public static final MTCodepointChar getItalicized(char c) {
        return c == 'h' ? new MTCodepointChar(kMTUnicodePlanksConstant) : isUpperEn(c) ? new MTCodepointChar(c - 11277) : isLowerEn(c) ? new MTCodepointChar(c - 11283) : isCapitalGreek(c) ? new MTCodepointChar(c - 11439) : isLowerGreek(c) ? new MTCodepointChar(c - 11445) : isGREEKSYMBOL(c) ? new MTCodepointChar(greekSymbolOrder(c) + kMTUnicodeGreekSymbolItalicStart) : new MTCodepointChar(c);
    }

    public static final MTCodepointChar getSansSerif(char c) {
        return isUpperEn(c) ? new MTCodepointChar(c - 10913) : isLowerEn(c) ? new MTCodepointChar(c - 10919) : isNumber(c) ? new MTCodepointChar(c - 10318) : getDefaultStyle(c);
    }

    public static final MTCodepointChar getTypewriter(char c) {
        return isUpperEn(c) ? new MTCodepointChar(c - 10705) : isLowerEn(c) ? new MTCodepointChar(c - 10711) : isNumber(c) ? new MTCodepointChar(c - 10298) : getDefaultStyle(c);
    }

    public static final int greekSymbolOrder(char c) {
        return mp0.J0(Integer.valueOf(c), new Integer[]{1013, 977, 1008, 981, 1009, 982});
    }

    public static final boolean isCapitalGreek(char c) {
        return x44.z(c, 913) >= 0 && x44.z(c, 937) <= 0;
    }

    public static final boolean isGREEKSYMBOL(char c) {
        return greekSymbolOrder(c) != -1;
    }

    public static final boolean isLowerEn(char c) {
        return x44.z(c, 97) >= 0 && x44.z(c, ModuleDescriptor.MODULE_VERSION) <= 0;
    }

    public static final boolean isLowerGreek(char c) {
        return x44.z(c, 945) >= 0 && x44.z(c, 969) <= 0;
    }

    public static final boolean isNumber(char c) {
        return x44.z(c, 48) >= 0 && x44.z(c, 57) <= 0;
    }

    public static final boolean isUpperEn(char c) {
        return x44.z(c, 65) >= 0 && x44.z(c, 90) <= 0;
    }

    public static final int numberOfGlyphs(String str) {
        str.getClass();
        return str.codePointCount(0, str.length());
    }

    public static final MTCodepointChar styleCharacter(char c, MTFontStyle mTFontStyle) throws MathDisplayException {
        mTFontStyle.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[mTFontStyle.ordinal()]) {
            case 1:
                return getDefaultStyle(c);
            case 2:
                return new MTCodepointChar(c);
            case 3:
                return getBold(c);
            case 4:
                return getItalicized(c);
            case 5:
                return getBoldItalic(c);
            case 6:
                return getCaligraphic(c);
            case 7:
                return getTypewriter(c);
            case 8:
                return getSansSerif(c);
            case 9:
                return getFraktur(c);
            case 10:
                return getBlackboard(c);
            default:
                throw new MathDisplayException("Unknown style " + mTFontStyle + " for font.");
        }
    }
}
