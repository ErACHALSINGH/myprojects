package com.arit;

public class TextEditor {
	private SpellChecker spellCheker;
	
	public TextEditor(SpellChecker spellCheker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellCheker= spellCheker;
	}
	
	public void spellCheck() {
		spellCheker.checkSpelling();
	}

}
