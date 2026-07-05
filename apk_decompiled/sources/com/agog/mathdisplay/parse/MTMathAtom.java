package com.agog.mathdisplay.parse;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.b54;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.rl7;
import defpackage.wg6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\rJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000bR.\u0010'\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00108\u001a\b\u0012\u0004\u0012\u00020\u0000078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathAtom;", "", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "type", "", "nucleus", "<init>", "(Lcom/agog/mathdisplay/parse/MTMathAtomType;Ljava/lang/String;)V", "s", "Liei;", "dumpstr", "(Ljava/lang/String;)V", "toLatexString", "()Ljava/lang/String;", "toStringSubs", "(Ljava/lang/String;)Ljava/lang/String;", "atom", "copyDeepContent", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)Lcom/agog/mathdisplay/parse/MTMathAtom;", "copyDeep", "()Lcom/agog/mathdisplay/parse/MTMathAtom;", "newNode", "finalized", "", "scriptsAllowed", "()Z", "description", "fuse", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)V", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "getType", "()Lcom/agog/mathdisplay/parse/MTMathAtomType;", "setType", "(Lcom/agog/mathdisplay/parse/MTMathAtomType;)V", "Ljava/lang/String;", "getNucleus", "setNucleus", "Lcom/agog/mathdisplay/parse/MTMathList;", ExperienceToggle.DEFAULT_PARAM_KEY, "superScript", "Lcom/agog/mathdisplay/parse/MTMathList;", "getSuperScript", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setSuperScript", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "subScript", "getSubScript", "setSubScript", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "fontStyle", "Lcom/agog/mathdisplay/parse/MTFontStyle;", "getFontStyle", "()Lcom/agog/mathdisplay/parse/MTFontStyle;", "setFontStyle", "(Lcom/agog/mathdisplay/parse/MTFontStyle;)V", "", "fusedAtoms", "Ljava/util/List;", "getFusedAtoms", "()Ljava/util/List;", "setFusedAtoms", "(Ljava/util/List;)V", "Lcom/agog/mathdisplay/parse/NSRange;", "indexRange", "Lcom/agog/mathdisplay/parse/NSRange;", "getIndexRange", "()Lcom/agog/mathdisplay/parse/NSRange;", "setIndexRange", "(Lcom/agog/mathdisplay/parse/NSRange;)V", "Factory", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public class MTMathAtom {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private MTFontStyle fontStyle;
    private List<MTMathAtom> fusedAtoms;
    private NSRange indexRange;
    private String nucleus;
    private MTMathList subScript;
    private MTMathList superScript;
    private MTMathAtomType type;

    public MTMathAtom(MTMathAtomType mTMathAtomType, String str) {
        mTMathAtomType.getClass();
        str.getClass();
        this.type = mTMathAtomType;
        this.nucleus = str;
        this.fontStyle = MTFontStyle.KMTFontStyleDefault;
        this.fusedAtoms = new ArrayList();
        this.indexRange = new NSRange(0, 0);
    }

    private final void dumpstr(String s) {
        char[] charArray = s.toCharArray();
        charArray.getClass();
        System.out.println((Object) ("str " + s + " codepoint " + Character.codePointAt(charArray, 0)));
        for (char c : charArray) {
            System.out.println((Object) ("c " + c));
        }
    }

    public MTMathAtom copyDeep() throws MathDisplayException {
        MTMathAtom mTMathAtom = new MTMathAtom(this.type, this.nucleus);
        copyDeepContent(mTMathAtom);
        return mTMathAtom;
    }

    public final MTMathAtom copyDeepContent(MTMathAtom atom) throws MathDisplayException {
        atom.getClass();
        MTMathList mTMathList = this.subScript;
        if (mTMathList != null) {
            atom.setSubScript(mTMathList != null ? mTMathList.copyDeep() : null);
        }
        MTMathList mTMathList2 = this.superScript;
        if (mTMathList2 != null) {
            atom.setSuperScript(mTMathList2 != null ? mTMathList2.copyDeep() : null);
        }
        atom.fusedAtoms.isEmpty();
        atom.fontStyle = this.fontStyle;
        atom.indexRange = NSRange.copy$default(this.indexRange, 0, 0, 3, null);
        return atom;
    }

    public final String description() {
        return INSTANCE.typeToText(this.type) + " " + this;
    }

    public final MTMathAtom finalized(MTMathAtom newNode) throws MathDisplayException {
        newNode.getClass();
        if (this.superScript != null) {
            MTMathList mTMathList = newNode.superScript;
            newNode.setSuperScript(mTMathList != null ? mTMathList.finalized() : null);
        }
        if (this.subScript != null) {
            MTMathList mTMathList2 = newNode.subScript;
            newNode.setSubScript(mTMathList2 != null ? mTMathList2.finalized() : null);
        }
        newNode.fontStyle = this.fontStyle;
        newNode.indexRange = NSRange.copy$default(this.indexRange, 0, 0, 3, null);
        return newNode;
    }

    public final void fuse(MTMathAtom atom) throws MathDisplayException {
        atom.getClass();
        if (this.subScript != null) {
            rl7.o("Cannot fuse into an atom which has a subscript: ", this);
            return;
        }
        if (this.superScript != null) {
            rl7.o("Cannot fuse into an atom which has a superscript: ", this);
            return;
        }
        if (this.type != atom.type) {
            throw new MathDisplayException("Only atoms of the same type can be fused: " + this + " " + atom);
        }
        if (this.fusedAtoms.size() == 0) {
            this.fusedAtoms.add(copyDeep());
        }
        int size = atom.fusedAtoms.size();
        List<MTMathAtom> list = this.fusedAtoms;
        if (size != 0) {
            b54.u0(list, atom.fusedAtoms.toArray(new MTMathAtom[0]));
        } else {
            list.add(atom);
        }
        this.nucleus = kgh.o(this.nucleus, atom.nucleus);
        NSRange nSRange = this.indexRange;
        nSRange.setLength(atom.indexRange.getLength() + nSRange.getLength());
        setSubScript(atom.subScript);
        setSuperScript(atom.superScript);
    }

    public final MTFontStyle getFontStyle() {
        return this.fontStyle;
    }

    public final List<MTMathAtom> getFusedAtoms() {
        return this.fusedAtoms;
    }

    public final NSRange getIndexRange() {
        return this.indexRange;
    }

    public final String getNucleus() {
        return this.nucleus;
    }

    public final MTMathList getSubScript() {
        return this.subScript;
    }

    public final MTMathList getSuperScript() {
        return this.superScript;
    }

    public final MTMathAtomType getType() {
        return this.type;
    }

    public final boolean scriptsAllowed() {
        return this.type.compareTo(MTMathAtomType.KMTMathAtomBoundary) < 0;
    }

    public final void setFontStyle(MTFontStyle mTFontStyle) {
        mTFontStyle.getClass();
        this.fontStyle = mTFontStyle;
    }

    public final void setFusedAtoms(List<MTMathAtom> list) {
        list.getClass();
        this.fusedAtoms = list;
    }

    public final void setIndexRange(NSRange nSRange) {
        nSRange.getClass();
        this.indexRange = nSRange;
    }

    public final void setNucleus(String str) {
        str.getClass();
        this.nucleus = str;
    }

    public final void setSubScript(MTMathList mTMathList) throws MathDisplayException {
        if (scriptsAllowed()) {
            this.subScript = mTMathList;
        } else {
            rl7.o("Subscripts not allowed for atom ", this);
        }
    }

    public final void setSuperScript(MTMathList mTMathList) throws MathDisplayException {
        if (scriptsAllowed()) {
            this.superScript = mTMathList;
        } else {
            rl7.o("Superscripts not allowed for atom ", this);
        }
    }

    public final void setType(MTMathAtomType mTMathAtomType) {
        mTMathAtomType.getClass();
        this.type = mTMathAtomType;
    }

    public String toLatexString() {
        return toStringSubs(this.nucleus);
    }

    public final String toStringSubs(String s) {
        s.getClass();
        MTMathList mTMathList = this.superScript;
        if (mTMathList != null) {
            s = kgh.p(s, "^{", MTMathListBuilder.INSTANCE.toLatexString(mTMathList), "}");
        }
        MTMathList mTMathList2 = this.subScript;
        return mTMathList2 != null ? kgh.p(s, "_{", MTMathListBuilder.INSTANCE.toLatexString(mTMathList2), "}") : s;
    }

    /* JADX INFO: renamed from: com.agog.mathdisplay.parse.MTMathAtom$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathAtom$Factory;", "Lcom/agog/mathdisplay/parse/MTMathAtomFactory;", "<init>", "()V", "isNotBinaryOperator", "", "prevNode", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "typeToText", "", "type", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "atomWithType", ExperienceToggle.DEFAULT_PARAM_KEY, "atomForCharacter", "ch", "", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion extends MTMathAtomFactory {

        /* JADX INFO: renamed from: com.agog.mathdisplay.parse.MTMathAtom$Factory$WhenMappings */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MTMathAtomType.values().length];
                try {
                    iArr[MTMathAtomType.KMTMathAtomNone.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomOrdinary.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomNumber.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomVariable.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomBinaryOperator.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomUnaryOperator.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomRelation.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomOpen.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomClose.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomFraction.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomRadical.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomPunctuation.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomPlaceholder.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomLargeOperator.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomInner.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomUnderline.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomOverline.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomAccent.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomCancel.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomBoxed.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomPhantom.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomUnderOverBrace.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomBoundary.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomSpace.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomStyle.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomColor.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomColorbox.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomTextColor.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[MTMathAtomType.KMTMathAtomTable.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final MTMathAtom atomForCharacter(char ch) throws MathDisplayException {
            String string = Character.toString(ch);
            if (ch < '!' || ch > '~' || ch == '$' || ch == '%' || ch == '#' || ch == '&' || ch == '~' || ch == '\'' || ch == '^' || ch == '_' || ch == '{' || ch == '}' || ch == '\\') {
                return null;
            }
            if (ch == '(' || ch == '[') {
                MTMathAtomType mTMathAtomType = MTMathAtomType.KMTMathAtomOpen;
                string.getClass();
                return atomWithType(mTMathAtomType, string);
            }
            if (ch == ')' || ch == ']' || ch == '!' || ch == '?') {
                MTMathAtomType mTMathAtomType2 = MTMathAtomType.KMTMathAtomClose;
                string.getClass();
                return atomWithType(mTMathAtomType2, string);
            }
            if (ch == ',' || ch == ';') {
                MTMathAtomType mTMathAtomType3 = MTMathAtomType.KMTMathAtomPunctuation;
                string.getClass();
                return atomWithType(mTMathAtomType3, string);
            }
            if (ch == '=' || ch == '>' || ch == '<') {
                MTMathAtomType mTMathAtomType4 = MTMathAtomType.KMTMathAtomRelation;
                string.getClass();
                return atomWithType(mTMathAtomType4, string);
            }
            if (ch == ':') {
                return atomWithType(MTMathAtomType.KMTMathAtomRelation, "∶");
            }
            if (ch == '-') {
                return atomWithType(MTMathAtomType.KMTMathAtomBinaryOperator, "−");
            }
            if (ch == '+' || ch == '*') {
                MTMathAtomType mTMathAtomType5 = MTMathAtomType.KMTMathAtomBinaryOperator;
                string.getClass();
                return atomWithType(mTMathAtomType5, string);
            }
            if (ch == '.' || ('0' <= ch && ch < ':')) {
                MTMathAtomType mTMathAtomType6 = MTMathAtomType.KMTMathAtomNumber;
                string.getClass();
                return atomWithType(mTMathAtomType6, string);
            }
            if (('a' <= ch && ch < '{') || ('A' <= ch && ch < '[')) {
                MTMathAtomType mTMathAtomType7 = MTMathAtomType.KMTMathAtomVariable;
                string.getClass();
                return atomWithType(mTMathAtomType7, string);
            }
            if (ch == '\"' || ch == '/' || ch == '@' || ch == '`' || ch == '|') {
                MTMathAtomType mTMathAtomType8 = MTMathAtomType.KMTMathAtomOrdinary;
                string.getClass();
                return atomWithType(mTMathAtomType8, string);
            }
            throw new MathDisplayException("Unknown ascii character " + ch + ". Should have been accounted for.");
        }

        public final MTMathAtom atomWithType(MTMathAtomType type, String value) {
            type.getClass();
            value.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 10) {
                return new MTFraction(true);
            }
            if (i == 11) {
                return new MTRadical();
            }
            if (i == 24) {
                return new MTMathSpace(MTTypesetterKt.kLineSkipLimitMultiplier);
            }
            if (i == 26) {
                return new MTMathColor();
            }
            switch (i) {
                case 13:
                    return new MTMathAtom(MTMathAtomType.KMTMathAtomPlaceholder, "□");
                case 14:
                    return new MTLargeOperator(value, true);
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    return new MTInner();
                case 16:
                    return new MTUnderLine();
                case g.MAX_FIELD_NUMBER /* 17 */:
                    return new MTOverLine();
                case g.AVG_FIELD_NUMBER /* 18 */:
                    return new MTAccent(value);
                default:
                    return new MTMathAtom(type, value);
            }
        }

        public final boolean isNotBinaryOperator(MTMathAtom prevNode) {
            return prevNode == null || prevNode.getType() == MTMathAtomType.KMTMathAtomBinaryOperator || prevNode.getType() == MTMathAtomType.KMTMathAtomRelation || prevNode.getType() == MTMathAtomType.KMTMathAtomOpen || prevNode.getType() == MTMathAtomType.KMTMathAtomPunctuation || prevNode.getType() == MTMathAtomType.KMTMathAtomLargeOperator;
        }

        public final String typeToText(MTMathAtomType type) {
            type.getClass();
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return "None";
                case 2:
                    return "Ordinary";
                case 3:
                    return "Number";
                case 4:
                    return "Variable";
                case 5:
                    return "Binary Operator";
                case 6:
                    return "Unary Operator";
                case 7:
                    return "Relation";
                case 8:
                    return "Open";
                case 9:
                    return "Close";
                case 10:
                    return "Fraction";
                case 11:
                    return "Radical";
                case 12:
                    return "Punctuation";
                case 13:
                    return "Placeholder";
                case 14:
                    return "Large Operator";
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    return "Inner";
                case 16:
                    return "Underline";
                case g.MAX_FIELD_NUMBER /* 17 */:
                    return "Overline";
                case g.AVG_FIELD_NUMBER /* 18 */:
                    return "Accent";
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    return "Cancel";
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    return "Boxed";
                case 21:
                    return "Phantom";
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    return "UnderOverBrace";
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    return "Boundary";
                case 24:
                    return "Space";
                case BuildConfig.VERSION_CODE /* 25 */:
                    return "Style";
                case 26:
                    return "Color";
                case 27:
                    return "Colorbox";
                case 28:
                    return "TextColor";
                case 29:
                    return "Table";
                default:
                    wg6.i();
                    return null;
            }
        }

        private Companion() {
        }
    }

    public MTMathAtom finalized() {
        return finalized(copyDeep());
    }
}
