// ============================================================
// JD-to-Resume Generator — Core Application Logic
// Profile data, Gemini integration, LaTeX generation
// ============================================================

// ─── Manas Mishra's Complete Profile Data ────────────────────
const PROFILE = {
  name: "Manas Mishra",
  email: "manasmishra131005@gmail.com",
  phone: "", // Add if needed
  linkedin: "linkedin.com/in/manas-mishra-a05679294",
  github: "github.com/Ma-nas",
  location: "Bengaluru, India",
  targetRoles: ["AI Engineer", "ML Engineer", "Data Scientist", "Full Stack AI Developer"],

  education: {
    degree: "Bachelor of Technology in Computer Science Engineering (AI \\& ML)",
    institution: "Jain University, Faculty of Engineering \\& Technology",
    location: "Bengaluru, India",
    period: "2023 -- 2027 (Expected)",
    coursework: [
      "Machine Learning",
      "Deep Learning",
      "Natural Language Processing",
      "Data Structures \\& Algorithms",
      "Computer Vision",
      "Linear Algebra",
      "Probability \\& Statistics",
      "Object-Oriented Programming",
      "Database Management Systems",
      "Operating Systems",
      "Time Series Forecasting",
      "Numerical Optimization",
      "DevOps",
      "UI/UX Design",
      "Research Methodology"
    ]
  },

  experience: [
    {
      title: "Machine Learning Intern",
      company: "CodSoft",
      period: "June 2025 -- July 2025",
      bullets: [
        "Developed and deployed classification and regression ML models using scikit-learn and Python, achieving measurable accuracy improvements on structured datasets.",
        "Engineered end-to-end data pipelines including feature engineering, data preprocessing, and model evaluation using Pandas and NumPy.",
        "Implemented and benchmarked multiple algorithms (Random Forest, SVM, Logistic Regression) with hyperparameter tuning via GridSearchCV."
      ]
    }
  ],

  projects: [
    {
      name: "EvalForge",
      subtitle: "LLM Evaluation \\& Hallucination Detection Platform",
      link: "github.com/Ma-nas/EvalForge",
      period: "2025",
      tech: ["Python", "FastAPI", "React", "SQLite", "Sentence Transformers"],
      bullets: [
        "Built a production-grade LLM evaluation platform with automated hallucination detection using semantic similarity scoring via Sentence Transformers.",
        "Designed a multi-model benchmarking engine supporting side-by-side comparisons across GPT, Gemini, and open-source LLMs with quantitative metrics.",
        "Implemented a full-stack React dashboard with real-time evaluation results, SQLite persistence, and RESTful FastAPI backend."
      ]
    },
    {
      name: "TourismCo. AI",
      subtitle: "AI-Powered Travel Planning Platform",
      link: "tourism-co.vercel.app",
      period: "2025",
      tech: ["React", "TypeScript", "Node.js", "Socket.IO", "Gemini API", "RAG"],
      bullets: [
        "Architected an AI-powered travel planning OS with a RAG pipeline grounded in official Uttar Pradesh tourism data for factually accurate itineraries.",
        "Engineered a real-time conversational interface using Socket.IO, generating budget-optimized multi-city travel plans with dynamic cost breakdowns.",
        "Deployed a production React/TypeScript frontend on Vercel with server-side Node.js API handling Gemini-powered generation and context retrieval."
      ]
    },
    {
      name: "Adaptive Proximal Gradient Research",
      subtitle: "Novel Optimization Algorithm for High-Dimensional Regression",
      link: "github.com/Ma-nas/Mini\\_project",
      period: "2025",
      tech: ["Python", "NumPy", "scikit-learn", "Flask", "Matplotlib"],
      bullets: [
        "Developed a novel APG-DST (Adaptive Proximal Gradient with Dynamic Step-size Tuning) optimizer for high-dimensional sparse regression tasks.",
        "Benchmarked APG-DST against Ridge, LASSO, and Elastic Net regression, demonstrating competitive performance with improved convergence properties.",
        "Built an interactive Flask dashboard for real-time visualization of optimizer convergence, coefficient paths, and performance metrics."
      ]
    },
    {
      name: "AI Test Case Generator",
      subtitle: "Automated pytest Suite Generator",
      link: "github.com/Ma-nas/Ai-test-case-generator",
      period: "2025",
      tech: ["Python", "Gemini API", "pytest", "AST"],
      bullets: [
        "Created a CLI tool that leverages Google Gemini to auto-generate comprehensive pytest test suites from Python source files or natural language function descriptions.",
        "Implemented AST-based code parsing to extract function signatures, docstrings, and type hints for context-aware test generation.",
        "Achieved high-coverage test generation with edge case detection, parametrized tests, and fixture-based setup patterns."
      ]
    },
    {
      name: "Demand Forecasting System",
      subtitle: "Time-Series Inventory Optimization",
      link: "github.com/Ma-nas",
      period: "2025",
      tech: ["Python", "scikit-learn", "Pandas", "Matplotlib", "Time Series"],
      bullets: [
        "Built a time-series based demand forecasting system for inventory optimization using statistical and ML models.",
        "Implemented ARIMA, Prophet, and LSTM-based forecasting pipelines with automated hyperparameter tuning for multi-product prediction.",
        "Engineered feature pipelines incorporating seasonality, trend decomposition, and external variables to improve forecast accuracy."
      ]
    },
    {
      name: "WanderChat",
      subtitle: "AI Travel Companion Chatbot",
      link: "github.com/Ma-nas",
      period: "2025",
      tech: ["Python", "Streamlit", "Gemini API", "NLP"],
      bullets: [
        "Developed an AI-powered travel companion chatbot using Google Gemini API with context-aware multi-turn conversations.",
        "Implemented natural language understanding for travel queries including destination recommendations, itinerary planning, and local insights.",
        "Built an interactive Streamlit interface with session management and conversation history persistence."
      ]
    }
  ],

  skills: {
    "Languages": ["Python", "Java", "JavaScript", "TypeScript", "SQL", "HTML/CSS", "LaTeX"],
    "AI/ML": ["PyTorch", "TensorFlow", "scikit-learn", "NumPy", "Pandas", "OpenCV", "Matplotlib", "Sentence Transformers", "Hugging Face"],
    "LLM \\& NLP": ["Google Gemini API", "OpenAI API", "RAG Pipelines", "Prompt Engineering", "Hallucination Detection"],
    "Web Development": ["React", "Node.js", "FastAPI", "Flask", "Streamlit", "Socket.IO", "Tailwind CSS", "Vite"],
    "Databases": ["MySQL", "MongoDB", "SQLite"],
    "Tools \\& Infrastructure": ["Git", "Docker", "Jupyter", "Anaconda", "Vercel", "Figma", "Linux"]
  },

  certifications: [
    { name: "Introduction to Transformer-Based NLP", issuer: "NVIDIA", date: "June 2025" },
    { name: "NVIDIA Deep Learning", issuer: "NVIDIA", date: "2025" },
    { name: "Natural Language Processing Specialization", issuer: "Coursera/NVIDIA", date: "2025" },
    { name: "Deep Learning with Python: Optimizing Deep Learning Models", issuer: "LinkedIn Learning", date: "April 2026" },
    { name: "Introduction to DevOps", issuer: "Online", date: "2025" },
    { name: "Figma for UX Design", issuer: "LinkedIn Learning", date: "April 2026" },
    { name: "Fundamentals of Git \\& GitHub", issuer: "Microsoft Learn Student Ambassador", date: "" },
    { name: "Code Relay 2025 --- Participation", issuer: "Jain University FET", date: "March 2025" }
  ],

  preferredDomains: ["AI", "NLP", "Computer Vision", "Data Science", "Full Stack AI"]
};

// ─── API Key Management ──────────────────────────────────────
const API_KEY_STORAGE = 'gemini_api_key_resume_gen';

function getApiKey() {
  return localStorage.getItem(API_KEY_STORAGE) || '';
}

function setApiKey(key) {
  localStorage.setItem(API_KEY_STORAGE, key.trim());
}

function hasApiKey() {
  return getApiKey().length > 10;
}

// ─── Gemini API Call with Model Fallback ─────────────────────
const GEMINI_MODELS = [
  'gemini-2.0-flash-lite',
  'gemini-1.5-flash',
  'gemini-2.0-flash',
];

async function callGemini(prompt) {
  const apiKey = getApiKey();
  if (!apiKey) throw new Error('No API key configured');

  let lastError = null;

  for (const model of GEMINI_MODELS) {
    try {
      const response = await fetch(
        `https://generativelanguage.googleapis.com/v1beta/models/${model}:generateContent?key=${apiKey}`,
        {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({
            contents: [{ parts: [{ text: prompt }] }],
            generationConfig: {
              temperature: 0.7,
              topP: 0.9,
              maxOutputTokens: 8192,
            }
          })
        }
      );

      if (!response.ok) {
        const err = await response.json().catch(() => ({}));
        const errMsg = err.error?.message || '';

        // If quota exceeded, try next model
        if (response.status === 429 || errMsg.toLowerCase().includes('quota')) {
          lastError = new Error(`Quota exceeded for ${model}`);
          continue;
        }

        if (response.status === 400 || response.status === 403) {
          throw new Error('Invalid API key. Please check your Gemini API key in settings.');
        }
        throw new Error(errMsg || `API error: ${response.status}`);
      }

      const data = await response.json();
      const text = data.candidates?.[0]?.content?.parts?.[0]?.text;
      if (!text) {
        lastError = new Error(`Empty response from ${model}`);
        continue;
      }
      console.log(`✅ Used model: ${model}`);
      return text;

    } catch (err) {
      if (err.message.includes('Invalid API key')) throw err;
      lastError = err;
      console.warn(`⚠️ Model ${model} failed:`, err.message);
      continue;
    }
  }

  throw new Error(
    lastError?.message?.includes('quota') || lastError?.message?.includes('Quota')
      ? 'All model quotas exceeded. Please wait a few minutes or upgrade your Gemini API plan at ai.google.dev.'
      : (lastError?.message || 'All models failed. Please try again.')
  );
}

// ─── Build the System Prompt ─────────────────────────────────
function buildResumePrompt(jd) {
  const profileStr = JSON.stringify(PROFILE, null, 2);

  return `You are an expert ATS resume writer and career strategist. You have deep knowledge of Applicant Tracking Systems (ATS), LaTeX resume formatting, and how tech recruiters evaluate resumes.

YOUR TASK: Given a Job Description (JD) and a candidate's profile data, produce TWO things:
1. A perfectly tailored, 1-page ATS-optimized LaTeX resume
2. A new project suggestion that would strengthen the candidate's application

═══════════════════════════════════════════════════
CANDIDATE PROFILE DATA:
═══════════════════════════════════════════════════
${profileStr}

═══════════════════════════════════════════════════
JOB DESCRIPTION:
═══════════════════════════════════════════════════
${jd}

═══════════════════════════════════════════════════
INSTRUCTIONS FOR THE RESUME:
═══════════════════════════════════════════════════
1. Use the Jake Ryan LaTeX resume template format (the most popular ATS-friendly template).
2. The resume MUST fit on exactly 1 page. Be concise.
3. Select and reorder projects/skills/experience to best match the JD requirements.
4. Rewrite bullet points to mirror the JD's keywords and language while staying truthful to the candidate's actual work.
5. Use strong action verbs: Architected, Engineered, Implemented, Designed, Deployed, Optimized, etc.
6. Include quantifiable metrics where possible.
7. Order sections strategically: Education → Experience → Projects → Skills → Certifications (if space permits).
8. Only include 2-3 most relevant projects (not all 6) to save space.
9. Only include 2-3 most relevant certifications (not all 8).
10. Tailor the skills section to emphasize technologies mentioned in the JD.
11. Do NOT include a summary/objective section — ATS prefers direct content.
12. Do NOT include any photographs or graphics.

═══════════════════════════════════════════════════
INSTRUCTIONS FOR THE PROJECT SUGGESTION:
═══════════════════════════════════════════════════
Suggest 1 new project the candidate could build that would:
- Directly demonstrate skills the JD is asking for
- Fill gaps between the candidate's current projects and the JD requirements
- Be realistically buildable in 1-2 weeks
- Sound impressive on a resume

═══════════════════════════════════════════════════
OUTPUT FORMAT (STRICT):
═══════════════════════════════════════════════════
You MUST respond with a JSON object (and nothing else) in this exact format:

{
  "ats_score": <number 0-100 representing how well the tailored resume matches the JD>,
  "ats_feedback": "<1 sentence explaining the score>",
  "latex": "<the complete LaTeX resume code, properly escaped for JSON>",
  "project": {
    "title": "<project name>",
    "description": "<2-3 sentence description>",
    "tech_stack": ["tech1", "tech2", "tech3"],
    "why": "<1-2 sentences on why this project would help land this specific role>"
  }
}

IMPORTANT: Return ONLY the JSON object. No markdown, no code fences, no explanations outside the JSON.
The LaTeX code must be a complete, compilable document starting with \\documentclass and ending with \\end{document}.`;
}

// ─── Parse Gemini Response ───────────────────────────────────
function parseGeminiResponse(rawText) {
  // Strip markdown code fences if present
  let cleaned = rawText.trim();
  cleaned = cleaned.replace(/^```(?:json)?\s*/i, '').replace(/\s*```$/i, '');
  cleaned = cleaned.trim();

  try {
    return JSON.parse(cleaned);
  } catch (e) {
    // Try to extract JSON from the response
    const jsonMatch = cleaned.match(/\{[\s\S]*\}$/);
    if (jsonMatch) {
      try {
        return JSON.parse(jsonMatch[0]);
      } catch (e2) {
        throw new Error('Failed to parse AI response. Please try again.');
      }
    }
    throw new Error('Invalid response format from AI. Please try again.');
  }
}

// ─── Main Generate Function ──────────────────────────────────
async function generateResume(jd) {
  if (!jd || jd.trim().length < 50) {
    throw new Error('Please paste a complete Job Description (at least 50 characters).');
  }

  if (!hasApiKey()) {
    throw new Error('API_KEY_MISSING');
  }

  const prompt = buildResumePrompt(jd);
  const rawResponse = await callGemini(prompt);
  const result = parseGeminiResponse(rawResponse);

  // Validate result structure
  if (!result.latex || !result.project) {
    throw new Error('Incomplete response from AI. Please try again.');
  }

  return result;
}

// ─── UI Controller ───────────────────────────────────────────
document.addEventListener('DOMContentLoaded', () => {
  // Elements
  const jdInput = document.getElementById('jd-input');
  const charCount = document.getElementById('char-count');
  const generateBtn = document.getElementById('btn-generate');
  const outputPanel = document.getElementById('output-panel');
  const emptyState = document.getElementById('empty-state');
  const atsCard = document.getElementById('ats-card');
  const latexCard = document.getElementById('latex-card');
  const projectCard = document.getElementById('project-card');
  const latexOutput = document.getElementById('latex-output');
  const atsRingProgress = document.getElementById('ats-ring-progress');
  const atsValue = document.getElementById('ats-value');
  const atsTitle = document.getElementById('ats-title');
  const atsFeedback = document.getElementById('ats-feedback');
  const projectTitle = document.getElementById('project-title');
  const projectDesc = document.getElementById('project-desc');
  const projectTech = document.getElementById('project-tech');
  const projectWhy = document.getElementById('project-why');
  const btnCopy = document.getElementById('btn-copy');
  const btnDownload = document.getElementById('btn-download');
  const settingsBtn = document.getElementById('btn-settings');
  const modalOverlay = document.getElementById('modal-overlay');
  const modalInput = document.getElementById('modal-api-key');
  const modalError = document.getElementById('modal-error');
  const modalSaveBtn = document.getElementById('modal-save');
  const toast = document.getElementById('toast');

  let currentLatex = '';

  // ── Character Count ──
  jdInput.addEventListener('input', () => {
    const len = jdInput.value.length;
    charCount.textContent = `${len.toLocaleString()} chars`;
  });

  // ── Check API Key on Load ──
  if (!hasApiKey()) {
    showModal();
  }

  // ── Modal Controls ──
  function showModal() {
    modalOverlay.classList.add('active');
    modalInput.value = getApiKey();
    modalError.classList.remove('visible');
    setTimeout(() => modalInput.focus(), 300);
  }

  function hideModal() {
    modalOverlay.classList.remove('active');
  }

  settingsBtn.addEventListener('click', showModal);

  modalOverlay.addEventListener('click', (e) => {
    if (e.target === modalOverlay && hasApiKey()) {
      hideModal();
    }
  });

  modalSaveBtn.addEventListener('click', () => {
    const key = modalInput.value.trim();
    if (!key || key.length < 10) {
      modalError.textContent = 'Please enter a valid Gemini API key.';
      modalError.classList.add('visible');
      return;
    }
    setApiKey(key);
    modalError.classList.remove('visible');
    hideModal();
    showToast('✅', 'API key saved successfully');
  });

  modalInput.addEventListener('keydown', (e) => {
    if (e.key === 'Enter') modalSaveBtn.click();
  });

  // ── Generate Resume ──
  generateBtn.addEventListener('click', async () => {
    const jd = jdInput.value.trim();

    if (!jd || jd.length < 50) {
      showToast('⚠️', 'Please paste a complete Job Description');
      return;
    }

    if (!hasApiKey()) {
      showModal();
      return;
    }

    // Set loading state
    generateBtn.classList.add('loading');
    generateBtn.disabled = true;
    emptyState.style.display = 'none';

    // Show shimmer loading
    atsCard.classList.remove('visible');
    latexCard.classList.remove('visible');
    projectCard.classList.remove('visible');

    try {
      const result = await generateResume(jd);

      // Update ATS Score
      const score = Math.min(100, Math.max(0, result.ats_score || 75));
      const circumference = 157;
      const offset = circumference - (circumference * score / 100);
      atsRingProgress.style.strokeDashoffset = offset;
      atsValue.textContent = `${score}%`;
      atsTitle.textContent = score >= 80 ? 'Excellent Match' : score >= 60 ? 'Good Match' : 'Fair Match';
      atsFeedback.textContent = result.ats_feedback || 'Resume tailored to match the JD requirements.';

      // Update LaTeX output
      currentLatex = result.latex;
      latexOutput.textContent = result.latex;

      // Update Project Suggestion
      const proj = result.project;
      projectTitle.textContent = proj.title || 'Suggested Project';
      projectDesc.textContent = proj.description || '';
      projectTech.innerHTML = (proj.tech_stack || [])
        .map(t => `<span class="tech-tag">${escapeHtml(t)}</span>`)
        .join('');
      projectWhy.innerHTML = `<strong>Why this project?</strong> ${escapeHtml(proj.why || '')}`;

      // Animate cards in
      setTimeout(() => atsCard.classList.add('visible'), 100);
      setTimeout(() => latexCard.classList.add('visible'), 250);
      setTimeout(() => projectCard.classList.add('visible'), 400);

      showToast('🎉', 'Resume generated successfully!');

    } catch (err) {
      if (err.message === 'API_KEY_MISSING') {
        showModal();
      } else {
        showToast('❌', err.message);
        emptyState.style.display = '';
      }
    } finally {
      generateBtn.classList.remove('loading');
      generateBtn.disabled = false;
    }
  });

  // ── Copy LaTeX ──
  btnCopy.addEventListener('click', async () => {
    if (!currentLatex) return;
    try {
      await navigator.clipboard.writeText(currentLatex);
      btnCopy.classList.add('copied');
      btnCopy.innerHTML = '✓ Copied!';
      showToast('📋', 'LaTeX copied to clipboard');
      setTimeout(() => {
        btnCopy.classList.remove('copied');
        btnCopy.innerHTML = '📋 Copy LaTeX';
      }, 2000);
    } catch {
      // Fallback
      const ta = document.createElement('textarea');
      ta.value = currentLatex;
      document.body.appendChild(ta);
      ta.select();
      document.execCommand('copy');
      document.body.removeChild(ta);
      btnCopy.classList.add('copied');
      btnCopy.innerHTML = '✓ Copied!';
      setTimeout(() => {
        btnCopy.classList.remove('copied');
        btnCopy.innerHTML = '📋 Copy LaTeX';
      }, 2000);
    }
  });

  // ── Download .tex ──
  btnDownload.addEventListener('click', () => {
    if (!currentLatex) return;
    const blob = new Blob([currentLatex], { type: 'application/x-tex' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = 'Manas_Mishra_Resume.tex';
    document.body.appendChild(a);
    a.click();
    document.body.removeChild(a);
    URL.revokeObjectURL(url);
    showToast('💾', 'Resume downloaded as .tex file');
  });

  // ── Toast ──
  let toastTimeout;
  function showToast(icon, message) {
    const toastIcon = toast.querySelector('.toast-icon');
    const toastText = toast.querySelector('.toast-text');
    toastIcon.textContent = icon;
    toastText.textContent = message;
    toast.classList.add('visible');
    clearTimeout(toastTimeout);
    toastTimeout = setTimeout(() => toast.classList.remove('visible'), 3000);
  }

  // ── Utility ──
  function escapeHtml(text) {
    const div = document.createElement('div');
    div.textContent = text;
    return div.innerHTML;
  }

  // ── Keyboard shortcut: Ctrl+Enter to generate ──
  jdInput.addEventListener('keydown', (e) => {
    if ((e.ctrlKey || e.metaKey) && e.key === 'Enter') {
      generateBtn.click();
    }
  });
});
