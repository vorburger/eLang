package ch.vorburger.elang.engine.ast;

import ch.vorburger.elang.engine.data.Location;

/**
 * @author Michael Vorburger (MVO)
 */
/* package-local */ class LocationImpl implements Location {

	protected final int lineStart;
	protected final int lineEnd;
	protected final int posStart;
	protected final int posEnd;
	protected final String tokenText;

	protected LocationImpl(int lineStart, int lineEnd, int posStart, int posEnd, String tokenText) {
		super();
		this.lineStart = lineStart;
		this.lineEnd = lineEnd;
		this.posStart = posStart;
		this.posEnd = posEnd;
		this.tokenText = tokenText;
	}

	protected LocationImpl(Location l) {
		this(l.getLineStart(), l.getLineEnd(), l.getColumnStart(), l.getColumnEnd(), l.getText());
	}

	@Override
	public final int getLineStart() {
		return this.lineStart;
	}

	@Override
	public int getLineEnd() {
		return this.lineEnd;
	}
	
	@Override
	public final int getColumnEnd() {
		return this.posEnd;
	}

	@Override
	public final int getColumnStart() {
		return this.posStart;
	}

	@Override
	public final String getText() {
		return this.tokenText;
	}

}
